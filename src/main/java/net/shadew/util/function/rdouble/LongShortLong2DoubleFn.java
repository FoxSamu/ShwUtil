package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code long} and returns a {@code double}.
 */
public interface LongShortLong2DoubleFn {
    double invoke(long p1, short p2, long p3);
}
