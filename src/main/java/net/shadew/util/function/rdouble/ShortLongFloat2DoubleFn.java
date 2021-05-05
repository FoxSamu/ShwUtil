package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code float} and returns a {@code double}.
 */
public interface ShortLongFloat2DoubleFn {
    double invoke(short p1, long p2, float p3);
}
