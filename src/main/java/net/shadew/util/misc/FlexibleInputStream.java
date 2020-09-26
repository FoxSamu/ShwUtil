/*
 * Copyright (c) 2020 Shadew
 * Licensed under the Apache 2.0 License
 */

package net.shadew.util.misc;

import java.io.*;

import net.shadew.util.contract.NotNull;
import net.shadew.util.contract.Validate;

/**
 * A {@linkplain FilterInputStream wrapper} around {@link InputStream} that allows unreading bytes in a growable
 * pushback buffer (unlike {@link PushbackInputStream}, which has a fixed buffer size). This implementation also has
 * general support for {@link #mark(int) mark} and {@link #reset() reset}, regardless of the underlying input stream's
 * capabilities.
 */
public class FlexibleInputStream extends FilterInputStream {
    // Minimum buffer size, using 'compact()' will never shrink the buffer below this size
    private final int minSize;

    // The unread buffer, subsequent 'unread' calls will write to this buffer
    private byte[] unreadBuffer;

    // The index of the next byte in the unread buffer
    private int unreadIndex;

    // The mark buffer, when the stream is marked all read bytes are buffered here
    private byte[] markBuffer;

    // The place where the next read byte will be put into the mark buffer
    private int markIndex;

    // The maximum amount of bytes to be read after a 'mark' call
    private int markLimit;

    // Whether the stream is marked or not
    private boolean mark;

    // Whether the stream is closed or not
    private boolean closed;

    /**
     * Creates a {@link FlexibleInputStream} with a given unread buffer size.
     *
     * @param in               The input stream to wrap, must not be null
     * @param unreadBufferSize The unread buffer size, must be a positive and nonzero
     * @throws NullPointerException     When the specified input stream is null
     * @throws IllegalArgumentException When the unread buffer size is zero or negative
     */
    public FlexibleInputStream(@NotNull InputStream in, int unreadBufferSize) {
        super(checkNotNull(in));
        Validate.positive(unreadBufferSize, "unreadbufferSize");
        unreadBuffer = new byte[unreadBufferSize];
        unreadIndex = unreadBufferSize;
        minSize = unreadBufferSize;
    }

    /**
     * Creates a {@link FlexibleInputStream} with a default unread buffer size of 16.
     *
     * @param in The input stream to wrap, must not be null
     * @throws NullPointerException When the specified input stream is null
     */
    public FlexibleInputStream(@NotNull InputStream in) {
        this(checkNotNull(in), 16);
    }

    // We need to do the not-null check since FilterInputStream allows a null input stream. This method allows us to do
    // that before the super call
    private static InputStream checkNotNull(InputStream in) {
        Validate.notNull(in, "in");
        return in;
    }

    /**
     * Reads the next byte of data from this input stream. The value byte is returned as an <code>int</code> in the
     * range <code>0</code> to <code>255</code>. If no byte is available because the end of the stream has been reached,
     * the value <code>-1</code> is returned. This method blocks until input data is available, the end of the stream is
     * detected, or an exception is thrown.
     * <p>
     * This reads a byte from the input stream if no bytes are left in the unread buffer. Otherwise it will read and
     * remove the byte from the unread buffer. If the stream was marked, the byte will be put into the mark buffer if it
     * was not the end of the stream, or it will invalidate the mark if the mark read limit was reached.
     * </p>
     *
     * @return The next byte of data, or <code>-1</code> if the end of the stream is reached.
     *
     * @throws IOException If an I/O error occurs or when the stream is closed.
     */
    @Override
    public int read() throws IOException {
        if (closed) throw new IOException("Stream closed");

        int out;
        if (unreadIndex < unreadBuffer.length) {
            out = unreadBuffer[unreadIndex++]; // Unread byte available
        } else {
            out = super.read();                // Unread byte not available
        }

        if (out >= 0 && mark) {
            if (markIndex >= markLimit)
                mark = false;                          // Read limit exceeded, forget mark
            else if (markIndex < 0)
                markIndex++;                           // Negative mark index, just increment it
            else
                markBuffer[markIndex++] = (byte) out;  // Put byte in mark buffer otherwise
        }
        return out;
    }

    /**
     * Reads up to <code>b.length</code> bytes of data from this input stream into an array of bytes. This method blocks
     * until some input is available.
     * <p>
     * This method simply performs the call <code>{@link #read(byte[], int, int) read}(b, 0, b.length)</code> and
     * returns the result.
     * </p>
     *
     * @param b The buffer into which the data is read.
     * @return the total number of bytes read into the buffer, or
     *     <code>-1</code> if there is no more data because the end of
     *     the stream has been reached.
     *
     * @throws IOException If an I/O error occurs, or when the stream was closed.
     * @see FlexibleInputStream#read(byte[], int, int)
     * @throws NullPointerException When {@code b == null}
     */
    @Override
    public int read(byte[] b) throws IOException {
        Validate.notNull(b, "b");
        if (closed) throw new IOException("Stream closed");
        return read(b, 0, b.length);
    }

    /**
     * Reads up to <code>len</code> bytes of data from this input stream into an array of bytes. This method blocks
     * until some input is available.
     * <p>
     * When there are bytes left in the unread buffer, it will read only from the unread buffer, until either the unread
     * buffer is empty or when <code>len</code> bytes have been read. When the stream is marked it will either store the
     * read bytes in the mark buffer, or it will invalidate the mark if the read limit is exceeded.
     * </p>
     *
     * @param b The buffer into which the data is read.
     * @return The total number of bytes read into the buffer, or <code>-1</code> if there is no more data because the
     *     end of the stream has been reached.
     *
     * @throws IOException If an I/O error occurs, or when the stream was closed.
     * @see FlexibleInputStream#read(byte[], int, int)
     * @throws NullPointerException When {@code b == null}
     * @throws IndexOutOfBoundsException When {@code off < 0}, {@code len < 0} or when {@code off + len > b.length}
     */
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        Validate.notNull(b, "b");
        Validate.rangeValid(b, off, len, "b", "off", "len");
        if (closed) throw new IOException("Stream closed");
        if (len == 0) return 0; // Special case

        int available = unreadBuffer.length - unreadIndex;

        int out;
        if (len < available) {
            // We can read 'len' bytes from the unread buffer
            System.arraycopy(unreadBuffer, unreadIndex, b, off, len);
            unreadIndex += len;
            out = len;
        } else if (available > 0) {
            // We can't read 'len' bytes from the unread buffer, but there are still unread bytes available
            System.arraycopy(unreadBuffer, unreadIndex, b, off, available);
            unreadIndex += available;
            out = available;
        } else {
            // We can't read unread bytes at all, read from underlying stream
            out = super.read(b, off, len);
        }


        if (out > 0 && mark) {
            if (markIndex + out <= markLimit) {
                // Does not exceed mark limit

                if (markIndex < 0 && markIndex + out > 0) {
                    // Going from negative mark index to positive mark index
                    // Make sure we read only the needed bytes into the mark buffer
                    int copy = out + markIndex;
                    System.arraycopy(b, off + out - copy, markBuffer, 0, copy);
                } else if (markIndex >= 0) {
                    // Mark index positive, read all read bytes to the mark buffer
                    System.arraycopy(b, off, markBuffer, markIndex, out);
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
        byte[] n = new byte[unreadBuffer.length + size];
        System.arraycopy(unreadBuffer, unreadIndex, n, unreadIndex + size, unreadBuffer.length - unreadIndex);
        unreadBuffer = n;
        unreadIndex += size; // We prefix the buffer with more space, so index grows
    }

    /**
     * Unreads one byte into the unread buffer, if and only if it is not negative. This will resize the unread buffer if
     * necessary. If a mark was set, it will remove a byte from the mark buffer. If a mark was set but no bytes are in
     * the mark buffer, it will unread behind the mark position.
     *
     * @param b The byte to be unread. Any negative value is ignored.
     * @throws IOException When the stream is closed.
     */
    public void unread(int b) throws IOException {
        if (closed) throw new IOException("Stream closed");
        if (b != -1) {
            if (unreadIndex == 0) { // Grow if needed
                growUnreadBuffer(unreadBuffer.length);
            }

            unreadBuffer[--unreadIndex] = (byte) b;
            if (mark)
                markIndex--; // Forget about a remembered mark byte (if any)
        }
    }

    /**
     * Unreads <code>len</code> byte into the unread buffer, if and only if it is not negative. This will resize the
     * unread buffer if necessary. If a mark was set, it will remove up to <code>len</code> chars from the mark buffer.
     * If the mark buffer contains less bytes than <code>len</code>, it will unread behind the mark position.
     *
     * @param b   The bytes to be unread
     * @param off The offset in <code>b</code>
     * @param len The amount of bytes to unread
     * @throws IOException When the stream is closed.
     * @throws NullPointerException When {@code b == null}
     * @throws IndexOutOfBoundsException When {@code off < 0} or when {@code off + len > b.length}
     */
    public void unread(byte[] b, int off, int len) throws IOException {
        Validate.notNull(b, "b");
        if(len < 0) return;
        Validate.rangeValid(b, off, len, "b", "off", "len");
        if (closed) throw new IOException("Stream closed");
        if (len > unreadIndex) {
            // Grow unread buffer if necessary

            int newSize = unreadBuffer.length << 1; // * 2
            int remainder = unreadBuffer.length - unreadIndex;
            while (len + remainder > newSize)
                newSize <<= 1; // *= 2
            newSize -= unreadBuffer.length;
            growUnreadBuffer(newSize);
        }

        // Copy bytes to unread buffer
        System.arraycopy(b, off, unreadBuffer, unreadIndex - len, len);
        unreadIndex -= len;

        if (mark)
            markIndex -= len; // Forget about any remembered mark bytes
    }

    /**
     * Unreads <code>b.length</code> bytes into the unread buffer. This will simply perform <code>{@link #unread(byte[],
     * int, int)}(b, 0, b.length)</code>.
     *
     * @param b The bytes to be unread
     * @throws IOException When the stream is closed
     * @throws NullPointerException When {@code b == null}
     */
    public void unread(byte[] b) throws IOException {
        Validate.notNull(b, "b");
        if (closed) throw new IOException("Stream closed");
        unread(b, 0, b.length);
    }

    /**
     * Returns the next byte in the stream, without actually reading it. This method {@linkplain #read() reads} a byte
     * and immediately {@linkplain #unread(int) unreads} it again.
     *
     * @return The peeked byte, or -1 if the end of the stream was reached
     *
     * @throws IOException If an I/O error occurs, or when the stream was closed
     */
    public int peek() throws IOException {
        if (closed) throw new IOException("Stream closed");
        int r = read();
        if (r == -1) return -1; // Stop here
        unread(r);
        return r;
    }

    /**
     * Returns the next, up to <code>len</code>, bytes in the stream. This method {@linkplain #read(byte[], int, int)
     * reads} several bytes and immediately {@linkplain #unread(byte[], int, int) unreads} them again. This method
     * returns the exact amount of bytes that were read, or -1 if the end of the stream was reached, as specified {@link
     * #read(byte[], int, int)}
     *
     * @param b   The buffer to read bytes into
     * @param off The offset in the buffer
     * @param len The amount of bytes to peek
     * @return The exact amount of bytes read
     *
     * @throws IOException When an I/O error occurs, or when the stream was closed
     * @throws NullPointerException When {@code b == null}
     * @throws IndexOutOfBoundsException When {@code off < 0}, {@code len < 0} or when {@code off + len > b.length}
     */
    public int peek(byte[] b, int off, int len) throws IOException {
        Validate.notNull(b, "b");
        Validate.rangeValid(b, off, len, "b", "off", "len");
        if (closed) throw new IOException("Stream closed");
        int r = read(b, off, len);
        if (r == -1) return -1; // Stop here
        unread(b, off, r);
        return r;
    }

    /**
     * Returns the next, up to <code>b.length</code>, bytes in the stream. This method {@linkplain #read(byte[]) reads}
     * several bytes and immediately {@linkplain #unread(byte[]) unreads} them again. This method returns the exact
     * amount of bytes that were read, or -1 if the end of the stream was reached, as specified {@link #read(byte[])}
     *
     * @param b The buffer to read bytes into
     * @return The exact amount of bytes read
     *
     * @throws IOException When an I/O error occurs, or when the stream was closed
     * @throws NullPointerException When {@code b == null}
     */
    public int peek(@NotNull byte[] b) throws IOException {
        Validate.notNull(b, "b");
        if (closed) throw new IOException("Stream closed");
        return peek(b, 0, b.length);
    }

    /**
     * Cleans up all unnecessarily used memory. This method shrinks the unread buffer to fit the amount of bytes in the
     * buffer or to fit the minimum size. This method also shrinks the mark buffer so that it perfectly fits the read
     * limit, or it completely releases the mark buffer if no mark was set (or when it's invalidated).
     */
    public void compact() {
        int size = unreadBuffer.length - unreadIndex;
        int effSize = Math.max(size, minSize); // Compactified size must never be smaller than minSize

        byte[] n = new byte[effSize];
        System.arraycopy(unreadBuffer, unreadIndex, n, 0, effSize);
        unreadBuffer = n;

        int idxMove = effSize - size;
        unreadIndex -= idxMove; // Move unread index back

        if (!mark) markBuffer = null; // Mark buffer can be null, use that possibility
        else if (markBuffer.length != markLimit) {
            n = new byte[markLimit];
            System.arraycopy(markBuffer, 0, n, 0, markLimit);
            markBuffer = n;
        }
    }

    /**
     * Returns an estimate of the number of bytes that can be read (or skipped over) from this input stream without
     * blocking by the next caller of a method for this input stream. The next caller might be the same thread or
     * another thread. A single read or skip of this many bytes will not block, but may read or skip fewer bytes.
     * <p>
     * This method returns the amount of bytes in the unread buffer plus the available bytes of the underlying stream.
     * </p>
     *
     * @throws IOException When an I/O error occurs, or when the stream was closed.
     */
    @Override
    public int available() throws IOException {
        if (closed) throw new IOException("Stream closed");
        return unreadBuffer.length - unreadIndex + super.available();
    }

    /**
     * Sets the mark position of this stream to the current position. Marking the stream means it will remember all read
     * bytes until the stream is either closed, the {@code readLimit} is reached or when a new mark is set.
     *
     * @param readlimit The maximum amount of bytes to be remembered before the mark becomes invalidated.
     *
     * @throws IllegalArgumentException When {@code readlimit < 0}
     */
    @Override
    public synchronized void mark(int readlimit) {
        Validate.notNegative(readlimit, "readlimit");
        if (closed) return;
        if (markBuffer == null || markBuffer.length < readlimit) {
            markBuffer = new byte[readlimit]; // Create/Resize mark buffer if needed
        }
        mark = true;
        markIndex = 0;
        markLimit = readlimit;
    }

    /**
     * Resets the input stream position to the last mark, or throws an {@link IOException} when no mark was set. When
     * the current position is before the mark position, it will skip a certain amount of bytes. When the current
     * position is behind the mark position, it will unread the mark buffer (making remembered bytes available for
     * reading again).
     *
     * @throws IOException When an I/O error occurs, when the stream was not marked or when it was closed.
     */
    @Override
    public synchronized void reset() throws IOException {
        if (closed) throw new IOException("Stream closed");
        if (!mark) throw new IOException("Stream not marked");
        if (markIndex > 0)
            // Unread remembered bytes: simulate a reset
            unread(markBuffer, 0, markIndex);
        else if (markIndex < 0) {
            // Jump forward
            byte[] buf = new byte[Math.min(-markIndex, 1024)]; // Limit memory usage a bit, no more than 1024 bytes
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
     * Closes the stream. This sets the closed-flag to true and releases the unread buffer and the mark buffer, after
     * which it closes the underlying stream. Even though the underlying stream may still allow reading after being
     * closed (i.e. in case of a {@link ByteArrayInputStream}), this stream still does not allow reading after being
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
