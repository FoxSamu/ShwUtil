package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double} and an object and returns a {@code double}.
 */
public interface DoubleRef2DoubleFn<P2> {
    double invoke(double p1, P2 p2);
}
