package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code double} and a {@code long} and returns a {@code double}.
 */
public interface IntDoubleLong2DoubleFn {
    double invoke(int p1, double p2, long p3);
}
