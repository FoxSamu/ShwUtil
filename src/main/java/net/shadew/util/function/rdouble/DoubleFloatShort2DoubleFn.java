package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code short} and returns a {@code double}.
 */
public interface DoubleFloatShort2DoubleFn {
    double invoke(double p1, float p2, short p3);
}
