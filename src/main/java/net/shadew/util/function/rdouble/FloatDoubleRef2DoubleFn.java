package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code double} and an object and returns a {@code double}.
 */
public interface FloatDoubleRef2DoubleFn<P3> {
    double invoke(float p1, double p2, P3 p3);
}
