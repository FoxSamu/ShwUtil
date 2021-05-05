package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code short} and an {@code int} and returns a {@code double}.
 */
public interface LongShortInt2DoubleFn {
    double invoke(long p1, short p2, int p3);
}
