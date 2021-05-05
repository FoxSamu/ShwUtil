package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code float} and an object and returns a {@code double}.
 */
public interface IntFloatRef2DoubleFn<P3> {
    double invoke(int p1, float p2, P3 p3);
}
