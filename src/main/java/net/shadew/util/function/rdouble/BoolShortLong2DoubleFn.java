package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, a {@code short} and a {@code long} and returns a {@code double}.
 */
public interface BoolShortLong2DoubleFn {
    double invoke(boolean p1, short p2, long p3);
}
