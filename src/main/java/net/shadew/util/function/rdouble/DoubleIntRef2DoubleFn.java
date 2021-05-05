package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, an {@code int} and an object and returns a {@code double}.
 */
public interface DoubleIntRef2DoubleFn<P3> {
    double invoke(double p1, int p2, P3 p3);
}
