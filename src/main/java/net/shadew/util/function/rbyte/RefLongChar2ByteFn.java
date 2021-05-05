package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, a {@code long} and a {@code char} and returns a {@code byte}.
 */
public interface RefLongChar2ByteFn<P1> {
    byte invoke(P1 p1, long p2, char p3);
}