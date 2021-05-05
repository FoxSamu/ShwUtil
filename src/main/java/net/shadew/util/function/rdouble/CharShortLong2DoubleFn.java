package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, a {@code short} and a {@code long} and returns a {@code double}.
 */
public interface CharShortLong2DoubleFn {
    double invoke(char p1, short p2, long p3);
}
