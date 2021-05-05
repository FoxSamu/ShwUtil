package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code short} and a {@code long} and returns a {@code double}.
 */
public interface DoubleShortLong2DoubleFn {
    double invoke(double p1, short p2, long p3);
}
