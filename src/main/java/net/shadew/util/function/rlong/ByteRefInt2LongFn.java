package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, an object and an {@code int} and returns a {@code long}.
 */
public interface ByteRefInt2LongFn<P2> {
    long invoke(byte p1, P2 p2, int p3);
}
