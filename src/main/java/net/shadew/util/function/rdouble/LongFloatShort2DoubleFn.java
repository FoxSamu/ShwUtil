package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code short} and returns a {@code double}.
 */
public interface LongFloatShort2DoubleFn {
    double invoke(long p1, float p2, short p3);
}
