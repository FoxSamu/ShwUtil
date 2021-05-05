package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, an object and an {@code int} and returns a {@code double}.
 */
public interface DoubleRefInt2DoubleFn<P2> {
    double invoke(double p1, P2 p2, int p3);
}
