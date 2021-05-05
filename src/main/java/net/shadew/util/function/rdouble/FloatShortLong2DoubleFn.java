package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code short} and a {@code long} and returns a {@code double}.
 */
public interface FloatShortLong2DoubleFn {
    double invoke(float p1, short p2, long p3);
}
