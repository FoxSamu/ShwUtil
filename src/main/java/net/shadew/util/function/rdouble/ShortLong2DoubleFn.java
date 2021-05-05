package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short} and a {@code long} and returns a {@code double}.
 */
public interface ShortLong2DoubleFn {
    double invoke(short p1, long p2);
}
