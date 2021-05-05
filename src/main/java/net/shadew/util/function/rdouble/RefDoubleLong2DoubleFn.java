package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code double} and a {@code long} and returns a {@code double}.
 */
public interface RefDoubleLong2DoubleFn<P1> {
    double invoke(P1 p1, double p2, long p3);
}
