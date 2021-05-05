package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code double} and an object and returns a {@code double}.
 */
public interface DoubleDoubleRef2DoubleFn<P3> {
    double invoke(double p1, double p2, P3 p3);
}
