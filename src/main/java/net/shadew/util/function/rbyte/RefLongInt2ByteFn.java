package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, a {@code long} and an {@code int} and returns a {@code byte}.
 */
public interface RefLongInt2ByteFn<P1> {
    byte invoke(P1 p1, long p2, int p3);
}
