package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code long} and returns a {@code double}.
 */
public interface IntShortLong2DoubleFn {
    double invoke(int p1, short p2, long p3);
}
