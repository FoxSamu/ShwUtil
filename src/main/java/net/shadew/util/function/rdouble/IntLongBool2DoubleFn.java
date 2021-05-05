package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code boolean} and returns a {@code double}.
 */
public interface IntLongBool2DoubleFn {
    double invoke(int p1, long p2, boolean p3);
}
