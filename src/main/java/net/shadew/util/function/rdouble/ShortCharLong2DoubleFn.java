package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code char} and a {@code long} and returns a {@code double}.
 */
public interface ShortCharLong2DoubleFn {
    double invoke(short p1, char p2, long p3);
}
