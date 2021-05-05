package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, a {@code float} and a {@code long} and returns a {@code double}.
 */
public interface BoolFloatLong2DoubleFn {
    double invoke(boolean p1, float p2, long p3);
}
