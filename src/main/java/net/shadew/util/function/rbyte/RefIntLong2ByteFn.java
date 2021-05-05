package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, an {@code int} and a {@code long} and returns a {@code byte}.
 */
public interface RefIntLong2ByteFn<P1> {
    byte invoke(P1 p1, int p2, long p3);
}
