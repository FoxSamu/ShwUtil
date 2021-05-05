package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code long} and a {@code short} and returns a {@code double}.
 */
public interface LongLongShort2DoubleFn {
    double invoke(long p1, long p2, short p3);
}
