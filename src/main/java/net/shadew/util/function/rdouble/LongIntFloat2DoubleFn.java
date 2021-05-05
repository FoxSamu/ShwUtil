package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, an {@code int} and a {@code float} and returns a {@code double}.
 */
public interface LongIntFloat2DoubleFn {
    double invoke(long p1, int p2, float p3);
}
