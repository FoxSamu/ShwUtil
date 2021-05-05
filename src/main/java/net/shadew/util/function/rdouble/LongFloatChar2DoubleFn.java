package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code char} and returns a {@code double}.
 */
public interface LongFloatChar2DoubleFn {
    double invoke(long p1, float p2, char p3);
}
