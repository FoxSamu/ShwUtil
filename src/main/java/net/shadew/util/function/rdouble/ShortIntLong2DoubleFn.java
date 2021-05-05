package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, an {@code int} and a {@code long} and returns a {@code double}.
 */
public interface ShortIntLong2DoubleFn {
    double invoke(short p1, int p2, long p3);
}
