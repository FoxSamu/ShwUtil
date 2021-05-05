package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, a {@code long} and a {@code short} and returns a {@code double}.
 */
public interface BoolLongShort2DoubleFn {
    double invoke(boolean p1, long p2, short p3);
}
