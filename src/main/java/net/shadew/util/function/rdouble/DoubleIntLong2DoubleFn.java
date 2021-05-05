package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, an {@code int} and a {@code long} and returns a {@code double}.
 */
public interface DoubleIntLong2DoubleFn {
    double invoke(double p1, int p2, long p3);
}
