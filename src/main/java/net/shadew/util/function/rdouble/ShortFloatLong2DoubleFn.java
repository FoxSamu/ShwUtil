package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code float} and a {@code long} and returns a {@code double}.
 */
public interface ShortFloatLong2DoubleFn {
    double invoke(short p1, float p2, long p3);
}
