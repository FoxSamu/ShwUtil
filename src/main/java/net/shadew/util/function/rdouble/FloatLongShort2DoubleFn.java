package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code long} and a {@code short} and returns a {@code double}.
 */
public interface FloatLongShort2DoubleFn {
    double invoke(float p1, long p2, short p3);
}
