package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code double} and returns a {@code double}.
 */
public interface LongFloatDouble2DoubleFn {
    double invoke(long p1, float p2, double p3);
}
