package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, an object and a {@code long} and returns a {@code char}.
 */
public interface DoubleRefLong2CharFn<P2> {
    char invoke(double p1, P2 p2, long p3);
}
