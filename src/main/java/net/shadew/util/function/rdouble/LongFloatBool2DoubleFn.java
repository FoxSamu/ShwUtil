package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code boolean} and returns a {@code double}.
 */
public interface LongFloatBool2DoubleFn {
    double invoke(long p1, float p2, boolean p3);
}
