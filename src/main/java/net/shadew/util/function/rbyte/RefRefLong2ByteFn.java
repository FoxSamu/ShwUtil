package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, an object and a {@code long} and returns a {@code byte}.
 */
public interface RefRefLong2ByteFn<P1, P2> {
    byte invoke(P1 p1, P2 p2, long p3);
}
