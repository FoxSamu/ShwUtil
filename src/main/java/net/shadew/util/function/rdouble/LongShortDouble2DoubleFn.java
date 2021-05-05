package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code double} and returns a {@code double}.
 */
public interface LongShortDouble2DoubleFn {
    double invoke(long p1, short p2, double p3);
}
