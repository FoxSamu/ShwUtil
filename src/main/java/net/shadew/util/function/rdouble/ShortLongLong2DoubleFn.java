package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code long} and returns a {@code double}.
 */
public interface ShortLongLong2DoubleFn {
    double invoke(short p1, long p2, long p3);
}
