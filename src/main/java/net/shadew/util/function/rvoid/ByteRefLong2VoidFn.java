package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code byte}, an object and a {@code long} and returns nothing.
 */
public interface ByteRefLong2VoidFn<P2> {
    void invoke(byte p1, P2 p2, long p3);
}
