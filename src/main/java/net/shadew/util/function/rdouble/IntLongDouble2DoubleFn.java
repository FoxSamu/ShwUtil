package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code double} and returns a {@code double}.
 */
public interface IntLongDouble2DoubleFn {
    double invoke(int p1, long p2, double p3);
}
