package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, an object and a {@code double} and returns a {@code double}.
 */
public interface FloatRefDouble2DoubleFn<P2> {
    double invoke(float p1, P2 p2, double p3);
}
