package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, an {@code int} and a {@code long} and returns a {@code double}.
 */
public interface BoolIntLong2DoubleFn {
    double invoke(boolean p1, int p2, long p3);
}
