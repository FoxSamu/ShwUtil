package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code float} and a {@code long} and returns a {@code double}.
 */
public interface RefFloatLong2DoubleFn<P1> {
    double invoke(P1 p1, float p2, long p3);
}
