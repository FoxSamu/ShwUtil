package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code float} and returns a {@code double}.
 */
public interface IntLongFloat2DoubleFn {
    double invoke(int p1, long p2, float p3);
}