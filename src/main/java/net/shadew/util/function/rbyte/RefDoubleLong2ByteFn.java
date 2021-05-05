package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, a {@code double} and a {@code long} and returns a {@code byte}.
 */
public interface RefDoubleLong2ByteFn<P1> {
    byte invoke(P1 p1, double p2, long p3);
}
