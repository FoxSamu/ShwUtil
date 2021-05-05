package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code short} and returns a {@code double}.
 */
public interface IntLongShort2DoubleFn {
    double invoke(int p1, long p2, short p3);
}
