package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code long} and returns a {@code double}.
 */
public interface LongFloatLong2DoubleFn {
    double invoke(long p1, float p2, long p3);
}
