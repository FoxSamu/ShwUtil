package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code float} and returns a {@code double}.
 */
public interface LongShortFloat2DoubleFn {
    double invoke(long p1, short p2, float p3);
}
