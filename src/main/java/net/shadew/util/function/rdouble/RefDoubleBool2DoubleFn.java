package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code double} and a {@code boolean} and returns a {@code double}.
 */
public interface RefDoubleBool2DoubleFn<P1> {
    double invoke(P1 p1, double p2, boolean p3);
}
