package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code double} and an object and returns a {@code double}.
 */
public interface RefDoubleRef2DoubleFn<P1, P3> {
    double invoke(P1 p1, double p2, P3 p3);
}
