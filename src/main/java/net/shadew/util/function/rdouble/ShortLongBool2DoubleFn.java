package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code boolean} and returns a {@code double}.
 */
public interface ShortLongBool2DoubleFn {
    double invoke(short p1, long p2, boolean p3);
}
