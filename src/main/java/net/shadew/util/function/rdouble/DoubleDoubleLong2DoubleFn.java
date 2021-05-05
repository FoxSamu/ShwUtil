package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code double} and a {@code long} and returns a {@code double}.
 */
public interface DoubleDoubleLong2DoubleFn {
    double invoke(double p1, double p2, long p3);
}
