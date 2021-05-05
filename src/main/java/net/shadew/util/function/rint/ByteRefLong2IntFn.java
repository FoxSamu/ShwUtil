package net.shadew.util.function.rint;

/**
 * A function that takes a {@code byte}, an object and a {@code long} and returns an {@code int}.
 */
public interface ByteRefLong2IntFn<P2> {
    int invoke(byte p1, P2 p2, long p3);
}
