package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code char} and returns a {@code double}.
 */
public interface ShortLongChar2DoubleFn {
    double invoke(short p1, long p2, char p3);
}
