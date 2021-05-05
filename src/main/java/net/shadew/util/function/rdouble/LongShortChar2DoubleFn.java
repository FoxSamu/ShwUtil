package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code char} and returns a {@code double}.
 */
public interface LongShortChar2DoubleFn {
    double invoke(long p1, short p2, char p3);
}
