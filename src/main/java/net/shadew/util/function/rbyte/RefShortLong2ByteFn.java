package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, a {@code short} and a {@code long} and returns a {@code byte}.
 */
public interface RefShortLong2ByteFn<P1> {
    byte invoke(P1 p1, short p2, long p3);
}
