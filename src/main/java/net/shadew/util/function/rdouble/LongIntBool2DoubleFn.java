package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, an {@code int} and a {@code boolean} and returns a {@code double}.
 */
public interface LongIntBool2DoubleFn {
    double invoke(long p1, int p2, boolean p3);
}
