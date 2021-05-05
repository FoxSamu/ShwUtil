package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code double} and a {@code float} and returns a {@code double}.
 */
public interface RefDoubleFloat2DoubleFn<P1> {
    double invoke(P1 p1, double p2, float p3);
}
