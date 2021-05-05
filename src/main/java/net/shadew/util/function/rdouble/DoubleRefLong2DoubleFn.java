package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, an object and a {@code long} and returns a {@code double}.
 */
public interface DoubleRefLong2DoubleFn<P2> {
    double invoke(double p1, P2 p2, long p3);
}
