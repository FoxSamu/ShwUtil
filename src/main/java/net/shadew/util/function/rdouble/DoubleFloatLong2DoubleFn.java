package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code long} and returns a {@code double}.
 */
public interface DoubleFloatLong2DoubleFn {
    double invoke(double p1, float p2, long p3);
}
