package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code boolean} and returns a {@code double}.
 */
public interface DoubleFloatBool2DoubleFn {
    double invoke(double p1, float p2, boolean p3);
}
