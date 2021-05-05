package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, an {@code int} and an object and returns a {@code long}.
 */
public interface ByteIntRef2LongFn<P3> {
    long invoke(byte p1, int p2, P3 p3);
}
