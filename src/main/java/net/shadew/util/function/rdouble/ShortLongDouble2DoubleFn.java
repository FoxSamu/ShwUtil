package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code double} and returns a {@code double}.
 */
public interface ShortLongDouble2DoubleFn {
    double invoke(short p1, long p2, double p3);
}
