/*
 * Copyright (c) 2020 Shadew
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.shadew.util.misc;

import java.io.*;

import net.shadew.util.contract.NotNull;
import net.shadew.util.contract.Validate;

/**
 * A {@linkplain FilterReader wrapper} around {@link Reader} that allows unreading chars in a growable pushback buffer
 * (unlike {@link PushbackReader}, which has a fixed buffer size). This implementation also has general support for
 * {@link #mark(int) mark} and {@link #reset() reset}, regardless of the underlying reader's capabilities.
 */
public class FlexibleReader extends FilterReader {
    // Minimum buffer size, using 'compact()' will never shrink the buffer below this size
    private final int minSize;

    // The unread buffer, subsequent 'unread' calls will write to this buffer
    private char[] unreadBuffer;

    // The index of the next char in the unread buffer
    private int unreadIndex;

    // The mark buffer, when the reader is marked all read chars are buffered here
    private char[] markBuffer;

    // The place where the next read char will be put into the mark buffer
    private int markIndex;

    // The maximum amount of chars to be read after a 'mark' call
    private int markLimit;

    // Whether the reader is marked or not
    private boolean mark;

    // Whether the reader is closed or not
    private boolean closed;

    /**
     * Creates a {@link FlexibleReader} with a given unread buffer size.
     *
     * @param in               The reader to wrap, must not be null
     * @param unreadBufferSize The unread buffer size, must be a positive and nonzero
     * @throws NullPointerException     When the specified reader is null
     * @throws IllegalArgumentException When the unread buffer size is zero or negative
     */
    public FlexibleReader(@NotNull Reader in, int unreadBufferSize) {
        super(checkNotNull(in));
        Validate.positive(unreadBufferSize, "unreadbufferSize");
        unreadBuffer = new char[unreadBufferSize];
        unreadIndex = unreadBufferSize;
        minSize = unreadBufferSize;
    }

    /**
     * Creates a {@link FlexibleReader} with a default unread buffer size of 16.
     *
     * @param in The reader to wrap, must not be null
     * @throws NullPointerException When the specified reader is null
     */
    public FlexibleReader(@NotNull Reader in) {
        this(in, 16);
    }

    // Just a simple check to generate an error message as soon as we can - FilterReader can throw an NPE itself tho
    private static Reader checkNotNull(Reader in) {
        Validate.notNull(in, "in");
        return in;
    }

    /**
     * Reads the next char of data from this reader. The value char is returned as an <code>int</code>. If no char is
     * available because the end of the reader has been reached, the value <code>-1</code> is returned. This method
     * blocks until input data is available, the end of the reader is detected, or an exception is thrown.
     * <p>
     * This reads a char from the underlying reader if no chars are left in the unread buffer. Otherwise it will read
     * and remove the char from the unread buffer. If the reader was marked, the char will be put into the mark buffer
     * if it was not the end of the reader, or it will invalidate the mark if the mark read limit was reached.
     * </p>
     *
     * @return The next char of data, or <code>-1</code> if the end of the reader is reached.
     *
     * @throws IOException If an I/O error occurs or when the reader is closed.
     */
    @Override
    public int read() throws IOException {
        if (closed) throw new IOException("Reader closed");

        int out;
        if (unreadIndex < unreadBuffer.length) {
            out = unreadBuffer[unreadIndex++]; // Unread char available
        } else {
            out = super.read();                // Unread char not available
        }

        if (out >= 0 && mark) {
            if (markIndex >= markLimit)
                mark = false;                          // Read limit exceeded, forget mark
            else if (markIndex < 0)
                markIndex++;                           // Negative mark index, just increment it
            else
                markBuffer[markIndex++] = (char) out;  // Put char in mark buffer otherwise
        }
        return out;
    }

    /**
     * Reads up to <code>c.length</code> chars of data from this reader into an array of chars. This method blocks
     * until some input is available.
     * <p>
     * This method simply performs the call <code>{@link #read(char[], int, int) read}(c, 0, c.length)</code> and
     * returns the result.
     * </p>
     *
     * @param c The buffer into which the data is read.
     * @return The total number of chars read into the buffer, or <code>-1</code> if there is no more data because the
     *     end of the reader has been reached.
     *
     * @throws IOException          If an I/O error occurs, or when the reader was closed.
     * @throws NullPointerException When {@code c == null}
     * @see FlexibleReader#read(char[], int, int)
     */
    @Override
    public int read(char[] c) throws IOException {
        Validate.notNull(c, "c");
        if (closed) throw new IOException("Reader closed");
        return read(c, 0, c.length);
    }

    /**
     * Reads up to <code>len</code> chars of data from this reader into an array of chars. This method blocks
     * until some input is available.
     * <p>
     * When there are chars left in the unread buffer, it will read only from the unread buffer, until either the unread
     * buffer is empty or when <code>len</code> chars have been read. When the reader is marked it will either store the
     * read chars in the mark buffer, or it will invalidate the mark if the read limit is exceeded.
     * </p>
     *
     * @param c The buffer into which the data is read.
     * @return The total number of chars read into the buffer, or <code>-1</code> if there is no more data because the
     *     end of the reader has been reached.
     *
     * @throws IOException               If an I/O error occurs, or when the reader was closed.
     * @throws NullPointerException      When {@code c == null}
     * @throws IndexOutOfBoundsException When {@code off < 0}, {@code len < 0} or when {@code off + len > c.length}
     */
    @Override
    public int read(char[] c, int off, int len) throws IOException {
        Validate.notNull(c, "c");
        Validate.rangeValid(c, off, len, "c", "off", "len");
        if (closed) throw new IOException("Reader closed");
        if (len == 0) return 0; // Special case

        int available = unreadBuffer.length - unreadIndex;

        int out;
        if (len < available) {
            // We can read 'len' chars from the unread buffer
            System.arraycopy(unreadBuffer, unreadIndex, c, off, len);
            unreadIndex += len;
            out = len;
        } else if (available > 0) {
            // We can't read 'len' chars from the unread buffer, but there are still unread chars available
            System.arraycopy(unreadBuffer, unreadIndex, c, off, available);
            unreadIndex += available;
            out = available;
        } else {
            // We can't read unread chars at all, read from underlying reader
            out = super.read(c, off, len);
        }


        if (out > 0 && mark) {
            if (markIndex + out <= markLimit) {
                // Does not exceed mark limit

                if (markIndex < 0 && markIndex + out > 0) {
                    // Going from negative mark index to positive mark index
                    // Make sure we read only the needed chars into the mark buffer
                    int copy = out + markIndex;
                    System.arraycopy(c, off + out - copy, markBuffer, 0, copy);
                } else if (markIndex >= 0) {
                    // Mark index positive, read all read chars to the mark buffer
                    System.arraycopy(c, off, markBuffer, markIndex, out);
                }

                // This happens anyways, just leave it out of the if statement
                markIndex += out;
            } else {
                // Exceeds mark limit, invalidate
                mark = false;
            }
        }
        return out;
    }

    // Used to grow the unread buffer
    private void growUnreadBuffer(int size) {
        char[] n = new char[unreadBuffer.length + size];
        System.arraycopy(unreadBuffer, unreadIndex, n, unreadIndex + size, unreadBuffer.length - unreadIndex);
        unreadBuffer = n;
        unreadIndex += size; // We prefix the buffer with more space, so index grows
    }

    /**
     * Unreads one char into the unread buffer, if and only if it is not negative. This will resize the unread buffer if
     * necessary. If a mark was set, it will remove a char from the mark buffer. If a mark was set but no chars are in
     * the mark buffer, it will unread behind the mark position.
     *
     * @param c The char to be unread. Any negative value is ignored.
     * @throws IOException When the reader is closed.
     */
    public void unread(int c) throws IOException {
        if (closed) throw new IOException("Reader closed");
        if (c != -1) {
            if (unreadIndex == 0) { // Grow if needed
                growUnreadBuffer(unreadBuffer.length);
            }

            unreadBuffer[--unreadIndex] = (char) c;
            if (mark)
                markIndex--; // Forget about a remembered mark char (if any)
        }
    }

    /**
     * Unreads <code>len</code> chars into the unread buffer, if and only if it is not negative. This will resize the
     * unread buffer if necessary. If a mark was set, it will remove up to <code>len</code> chars from the mark buffer.
     * If the mark buffer contains less chars than <code>len</code>, it will unread behind the mark position.
     *
     * @param c   The chars to be unread
     * @param off The offset in <code>c</code>
     * @param len The amount of chars to unread
     * @throws IOException               When the reader is closed.
     * @throws NullPointerException      When {@code c == null}
     * @throws IndexOutOfBoundsException When {@code off < 0} or when {@code off + len > c.length}
     */
    public void unread(char[] c, int off, int len) throws IOException {
        Validate.notNull(c, "c");
        if (len < 0) return;
        Validate.rangeValid(c, off, len, "c", "off", "len");
        if (closed) throw new IOException("Reader closed");
        if (len > unreadIndex) {
            // Grow unread buffer if necessary

            int newSize = unreadBuffer.length << 1; // * 2
            int remainder = unreadBuffer.length - unreadIndex;
            while (len + remainder > newSize)
                newSize <<= 1; // *= 2
            newSize -= unreadBuffer.length;
            growUnreadBuffer(newSize);
        }

        // Copy chars to unread buffer
        System.arraycopy(c, off, unreadBuffer, unreadIndex - len, len);
        unreadIndex -= len;

        if (mark)
            markIndex -= len; // Forget about any remembered mark chars
    }

    /**
     * Unreads <code>c.length</code> chars into the unread buffer. This will simply perform <code>{@link #unread(char[],
     * int, int)}(c, 0, c.length)</code>.
     *
     * @param c The chars to be unread
     * @throws IOException          When the reader is closed
     * @throws NullPointerException When {@code c == null}
     */
    public void unread(char[] c) throws IOException {
        Validate.notNull(c, "c");
        if (closed) throw new IOException("Reader closed");
        unread(c, 0, c.length);
    }

    /**
     * Returns the next char in the reader, without actually reading it. This method {@linkplain #read() reads} a cjar
     * and immediately {@linkplain #unread(int) unreads} it again.
     *
     * @return The peeked char, or -1 if the end of the reader was reached
     *
     * @throws IOException If an I/O error occurs, or when the reader was closed
     */
    public int peek() throws IOException {
        if (closed) throw new IOException("Reader closed");
        int r = read();
        if (r == -1) return -1; // Stop here
        unread(r);
        return r;
    }

    /**
     * Returns the next, up to <code>len</code>, chars in the reader. This method {@linkplain #read(char[], int, int)
     * reads} several chars and immediately {@linkplain #unread(char[], int, int) unreads} them again. This method
     * returns the exact amount of chars that were read, or -1 if the end of the reader was reached, as specified {@link
     * #read(char[], int, int)}
     *
     * @param c   The buffer to read chars into
     * @param off The offset in the buffer
     * @param len The amount of chars to peek
     * @return The exact amount of chars read
     *
     * @throws IOException               When an I/O error occurs, or when the reader was closed
     * @throws NullPointerException      When {@code c == null}
     * @throws IndexOutOfBoundsException When {@code off < 0}, {@code len < 0} or when {@code off + len > c.length}
     */
    public int peek(char[] c, int off, int len) throws IOException {
        Validate.notNull(c, "c");
        Validate.rangeValid(c, off, len, "c", "off", "len");
        if (closed) throw new IOException("Reader closed");
        int r = read(c, off, len);
        if (r == -1) return -1; // Stop here
        unread(c, off, r);
        return r;
    }

    /**
     * Returns the next, up to <code>c.length</code>, chars in the reader. This method {@linkplain #read(char[]) reads}
     * several chars and immediately {@linkplain #unread(char[]) unreads} them again. This method returns the exact
     * amount of chars that were read, or -1 if the end of the reader was reached, as specified {@link #read(char[])}
     *
     * @param c The buffer to read chars into
     * @return The exact amount of chars read
     *
     * @throws IOException          When an I/O error occurs, or when the reader was closed
     * @throws NullPointerException When {@code c == null}
     */
    public int peek(@NotNull char[] c) throws IOException {
        Validate.notNull(c, "c");
        if (closed) throw new IOException("Reader closed");
        return peek(c, 0, c.length);
    }

    /**
     * Cleans up all unnecessarily used memory. This method shrinks the unread buffer to fit the amount of chars in the
     * buffer or to fit the minimum size. This method also shrinks the mark buffer so that it perfectly fits the read
     * limit, or it completely releases the mark buffer if no mark was set (or when it's invalidated).
     */
    public void compact() {
        int size = unreadBuffer.length - unreadIndex;
        int effSize = Math.max(size, minSize); // Compactified size must never be smaller than minSize

        char[] n = new char[effSize];
        System.arraycopy(unreadBuffer, unreadIndex, n, 0, effSize);
        unreadBuffer = n;

        int idxMove = effSize - size;
        unreadIndex -= idxMove; // Move unread index back

        if (!mark) markBuffer = null; // Mark buffer can be null, use that possibility
        else if (markBuffer.length != markLimit) {
            n = new char[markLimit];
            System.arraycopy(markBuffer, 0, n, 0, markLimit);
            markBuffer = n;
        }
    }

    /**
     * Sets the mark position of this reader to the current position. Marking the reader means it will remember all read
     * chars until the reader is either closed, the {@code readLimit} is reached or when a new mark is set.
     *
     * @param readlimit The maximum amount of chars to be remembered before the mark becomes invalidated.
     * @throws IllegalArgumentException When {@code readlimit < 0}
     */
    @Override
    public synchronized void mark(int readlimit) {
        Validate.notNegative(readlimit, "readlimit");
        if (closed) return;
        if (markBuffer == null || markBuffer.length < readlimit) {
            markBuffer = new char[readlimit]; // Create/Resize mark buffer if needed
        }
        mark = true;
        markIndex = 0;
        markLimit = readlimit;
    }

    /**
     * Resets the reader position to the last mark, or throws an {@link IOException} when no mark was set. When
     * the current position is before the mark position, it will skip a certain amount of chars. When the current
     * position is behind the mark position, it will unread the mark buffer (making remembered chars available for
     * reading again).
     *
     * @throws IOException When an I/O error occurs, when the reader was not marked or when it was closed.
     */
    @Override
    public synchronized void reset() throws IOException {
        if (closed) throw new IOException("Reader closed");
        if (!mark) throw new IOException("Reader not marked");
        if (markIndex > 0)
            // Unread remembered chars: simulate a reset
            unread(markBuffer, 0, markIndex);
        else if (markIndex < 0) {
            // Jump forward
            char[] buf = new char[Math.min(-markIndex, 1024)]; // Limit memory usage a bit, no more than 1024 chars
            while (markIndex < 0) {
                int r = read(buf);
                if (r == -1) break;
                markIndex += r;
            }
        }
        markIndex = 0;
    }

    /**
     * Returns whether {@link #mark(int)} and {@link #reset()} are supported, which is {@code true}.
     *
     * @return {@code true}
     */
    @Override
    public boolean markSupported() {
        return true;
    }

    /**
     * Closes the reader. This sets the closed-flag to true and releases the unread buffer and the mark buffer, after
     * which it closes the underlying reader. Even though the underlying reader may still allow reading after being
     * closed (i.e. in case of a {@link StringReader}), this reader still does not allow reading after being
     * closed.
     *
     * @throws IOException When an I/O error occurs.
     */
    @Override
    public void close() throws IOException {
        if (closed) return;
        closed = true;
        unreadBuffer = null;
        markBuffer = null;
        super.close();
    }
}
