package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code byte}, an object and a {@code long} and returns a {@code byte}.
 */
public interface ByteRefLong2ByteFn<P2> {
    byte invoke(byte p1, P2 p2, long p3);
}
