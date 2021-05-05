package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code float} and an {@code int} and returns a {@code double}.
 */
public interface LongFloatInt2DoubleFn {
    double invoke(long p1, float p2, int p3);
}
