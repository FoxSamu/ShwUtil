package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, an object and a {@code long} and returns a {@code long}.
 */
public interface ByteRefLong2LongFn<P2> {
    long invoke(byte p1, P2 p2, long p3);
}
