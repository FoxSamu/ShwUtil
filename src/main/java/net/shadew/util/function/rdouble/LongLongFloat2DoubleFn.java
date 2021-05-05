package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code long} and a {@code float} and returns a {@code double}.
 */
public interface LongLongFloat2DoubleFn {
    double invoke(long p1, long p2, float p3);
}
