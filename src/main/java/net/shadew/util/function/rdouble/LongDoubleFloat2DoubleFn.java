package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code double} and a {@code float} and returns a {@code double}.
 */
public interface LongDoubleFloat2DoubleFn {
    double invoke(long p1, double p2, float p3);
}
