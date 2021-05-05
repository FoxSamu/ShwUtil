package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, an object and a {@code boolean} and returns a {@code double}.
 */
public interface DoubleRefBool2DoubleFn<P2> {
    double invoke(double p1, P2 p2, boolean p3);
}
