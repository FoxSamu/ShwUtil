package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code double} and an object and returns a {@code double}.
 */
public interface IntDoubleRef2DoubleFn<P3> {
    double invoke(int p1, double p2, P3 p3);
}
