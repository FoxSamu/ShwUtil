package net.shadew.util.function.rbyte;

/**
 * A function that takes an object and a {@code long} and returns a {@code byte}.
 */
public interface RefLong2ByteFn<P1> {
    byte invoke(P1 p1, long p2);
}
