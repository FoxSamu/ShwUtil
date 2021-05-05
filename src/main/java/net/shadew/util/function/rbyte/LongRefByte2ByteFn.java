package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, an object and a {@code byte} and returns a {@code byte}.
 */
public interface LongRefByte2ByteFn<P2> {
    byte invoke(long p1, P2 p2, byte p3);
}