package net.shadew.util.misc;

import java.io.*;

import net.shadew.util.contract.NotNull;
import net.shadew.util.contract.Validate;

/**
 * Utilities for simple IO operations not included in the default {@link InputStream}, {@link OutputStream}, {@link
 * Reader} and {@link Writer} classes.
 */
public final class IO {
    private IO() {
    }

    /**
     * Copies all remaining bytes from an {@link InputStream} into an {@link OutputStream}.
     *
     * @param from           The input stream to read bytes from
     * @param to             The output stream to write bytes to
     * @param bufferCapacity The capacity of the read buffer used internally
     * @throws IOException          If any I/O error occurs
     * @throws NullPointerException When {@code from} or {@code to} is null
     */
    public static void copy(@NotNull InputStream from, @NotNull OutputStream to, int bufferCapacity) throws IOException {
        Validate.notNull(from, "from");
        Validate.notNull(to, "to");
        byte[] buf = new byte[bufferCapacity];
        int r;
        while ((r = from.read(buf)) != -1) {
            to.write(buf, 0, r);
        }
    }

    /**
     * Copies all remaining bytes from an {@link InputStream} into an {@link OutputStream}.
     *
     * @param from The input stream to read bytes from
     * @param to   The output stream to write bytes to
     * @throws IOException          If any I/O error occurs
     * @throws NullPointerException When {@code from} or {@code to} is null
     */
    public static void copy(@NotNull InputStream from, @NotNull OutputStream to) throws IOException {
        copy(from, to, 1024);
    }

    /**
     * Copies all remaining bytes from a {@link Reader} into a {@link Writer}.
     *
     * @param from           The reader to read chars from
     * @param to             The writer to write chars to
     * @param bufferCapacity The capacity of the read buffer used internally
     * @throws IOException          If any I/O error occurs
     * @throws NullPointerException When {@code from} or {@code to} is null
     */
    public static void copy(@NotNull Reader from, @NotNull Writer to, int bufferCapacity) throws IOException {
        Validate.notNull(from, "from");
        Validate.notNull(to, "to");
        char[] buf = new char[bufferCapacity];
        int r;
        while ((r = from.read(buf)) != -1) {
            to.write(buf, 0, r);
        }
    }

    /**
     * Copies all remaining bytes from a {@link Reader} into a {@link Writer}.
     *
     * @param from The reader to read chars from
     * @param to   The writer to write chars to
     * @throws IOException          If any I/O error occurs
     * @throws NullPointerException When {@code from} or {@code to} is null
     */
    public static void copy(@NotNull Reader from, @NotNull Writer to) throws IOException {
        copy(from, to, 1024);
    }

    /**
     * Reads all remaining bytes from an {@link InputStream}.
     *
     * @param stream The input stream to read bytes from
     * @param close  Whether to close the input stream after all bytes are read
     * @return A buffer with all bytes read from the input stream
     *
     * @throws IOException          When an I/O error occurs
     * @throws NullPointerException When {@code stream} is null
     */
    public static byte[] readAll(InputStream stream, boolean close) throws IOException {
        Validate.notNull(stream, "stream");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        copy(stream, baos);
        if (close) stream.close();
        return baos.toByteArray();
    }

    /**
     * Reads all remaining bytes from an {@link InputStream} and closes it. This is equivalent to calling:<br/> {@link
     * IO}{@code .}{@link #readAll(InputStream, boolean) readAll}{@code (stream, true)}
     *
     * @param stream The input stream to read bytes from
     * @return A buffer with all bytes read from the input stream
     *
     * @throws IOException          When an I/O error occurs
     * @throws NullPointerException When {@code stream} is null
     */
    public static byte[] readAll(InputStream stream) throws IOException {
        return readAll(stream, true);
    }

    /**
     * Reads all remaining chars from a {@link Reader}.
     *
     * @param reader The reader to read chars from
     * @param close  Whether to close the reader after all chars are read
     * @return A string representing all chars that were read from the reader
     *
     * @throws IOException          When an I/O error occurs
     * @throws NullPointerException When {@code reader} is null
     */
    public static String readAll(Reader reader, boolean close) throws IOException {
        Validate.notNull(reader, "reader");
        StringWriter sw = new StringWriter();
        copy(reader, sw);
        if (close) reader.close();
        return sw.toString();
    }

    /**
     * Reads all remaining chars from a {@link Reader}. This is equivalent to calling:<br/> {@link IO}{@code .}{@link
     * #readAll(Reader, boolean) readAll}{@code (reader, true)}
     *
     * @param reader The reader to read chars from
     * @return A string representing all chars that were read from the reader
     *
     * @throws IOException          When an I/O error occurs
     * @throws NullPointerException When {@code reader} is null
     */
    public static String readAll(Reader reader) throws IOException {
        return readAll(reader, true);
    }

    /**
     * Fills the specified output buffer with bytes, blocking until all required bytes are read. An {@link EOFException}
     * is thrown when the end of the stream was reached before all bytes were read.
     *
     * @param stream The input stream to read bytes from
     * @param out    The buffer to read bytes into
     * @param off    The offset in the buffer
     * @param len    The amount of bytes to read
     * @return The output buffer that was passed to this method
     *
     * @throws IOException                    When an I/O error occurs
     * @throws EOFException                   When the end of the stream was reached before all bytes were read
     * @throws ArrayIndexOutOfBoundsException When {@code off < 0}, {@code len < 0} or when {@code off+len >
     *                                        out.length}.
     * @throws NullPointerException           When {@code stream} or {@code out} is null
     */
    public static byte[] readFully(InputStream stream, byte[] out, int off, int len) throws IOException {
        Validate.notNull(stream, "stream");
        Validate.notNull(out, "out");
        if (off < 0 || len < 0 || off + len > out.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int read = 0;
        while (read < len) {
            int r = stream.read(out, off + read, len - read);
            if (r == -1) throw new EOFException();
            read += r;
        }

        return out;
    }

    /**
     * Fills the specified output buffer with bytes, blocking until all required bytes are read. An {@link EOFException}
     * is thrown when the end of the stream was reached before all bytes were read.
     *
     * @param stream The input stream to read bytes from
     * @param out    The buffer to read bytes into
     * @return The output buffer that was passed to this method
     *
     * @throws IOException                    When an I/O error occurs
     * @throws EOFException                   When the end of the stream was reached before all bytes were read
     * @throws ArrayIndexOutOfBoundsException When {@code off < 0}, {@code len < 0} or when {@code off+len >
     *                                        out.length}.
     * @throws NullPointerException           When {@code stream} or {@code out} is null
     */
    public static byte[] readFully(InputStream stream, byte[] out) throws IOException {
        return readFully(stream, out, 0, out.length);
    }

    /**
     * Fills the specified output buffer with chars, blocking until all required chars are read. An {@link EOFException}
     * is thrown when the end of the reader was reached before all chars were read.
     *
     * @param reader The reader to read chars from
     * @param out    The buffer to read chars into
     * @param off    The offset in the buffer
     * @param len    The amount of chars to read
     * @return The output buffer that was passed to this method
     *
     * @throws IOException                    When an I/O error occurs
     * @throws EOFException                   When the end of the reader was reached before all chars were read
     * @throws ArrayIndexOutOfBoundsException When {@code off < 0}, {@code len < 0} or when {@code off+len >
     *                                        out.length}.
     * @throws NullPointerException           When {@code reader} or {@code out} is null
     */
    public static char[] readFully(Reader reader, char[] out, int off, int len) throws IOException {
        Validate.notNull(reader, "reader");
        Validate.notNull(out, "out");
        if (off < 0 || len < 0 || off + len > out.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int read = 0;
        while (read < len) {
            int r = reader.read(out, off + read, len - read);
            if (r == -1) throw new EOFException();
            read += r;
        }

        return out;
    }

    /**
     * Fills the specified output buffer with chars, blocking until all required chars are read. An {@link EOFException}
     * is thrown when the end of the reader was reached before all chars were read.
     *
     * @param reader The reader to read chars from
     * @param out    The buffer to read chars into
     * @return The output buffer that was passed to this method
     *
     * @throws IOException                    When an I/O error occurs
     * @throws EOFException                   When the end of the reader was reached before all chars were read
     * @throws ArrayIndexOutOfBoundsException When {@code off < 0}, {@code len < 0} or when {@code off+len >
     *                                        out.length}.
     * @throws NullPointerException           When {@code reader} or {@code out} is null
     */
    public static char[] readFully(Reader reader, char[] out) throws IOException {
        return readFully(reader, out, 0, out.length);
    }
}
