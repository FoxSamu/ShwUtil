package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code float} and a {@code long} and returns a {@code double}.
 */
public interface IntFloatLong2DoubleFn {
    double invoke(int p1, float p2, long p3);
}