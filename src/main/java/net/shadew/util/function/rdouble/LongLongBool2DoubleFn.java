package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code long} and a {@code boolean} and returns a {@code double}.
 */
public interface LongLongBool2DoubleFn {
    double invoke(long p1, long p2, boolean p3);
}
