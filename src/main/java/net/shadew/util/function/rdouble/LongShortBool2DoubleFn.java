package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code boolean} and returns a {@code double}.
 */
public interface LongShortBool2DoubleFn {
    double invoke(long p1, short p2, boolean p3);
}
