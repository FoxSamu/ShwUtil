package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, a {@code long} and a {@code short} and returns a {@code byte}.
 */
public interface RefLongShort2ByteFn<P1> {
    byte invoke(P1 p1, long p2, short p3);
}
