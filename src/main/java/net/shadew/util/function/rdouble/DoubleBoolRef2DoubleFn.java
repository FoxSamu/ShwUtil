package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code boolean} and an object and returns a {@code double}.
 */
public interface DoubleBoolRef2DoubleFn<P3> {
    double invoke(double p1, boolean p2, P3 p3);
}
