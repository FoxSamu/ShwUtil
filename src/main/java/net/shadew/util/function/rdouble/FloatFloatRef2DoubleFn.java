package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code float} and an object and returns a {@code double}.
 */
public interface FloatFloatRef2DoubleFn<P3> {
    double invoke(float p1, float p2, P3 p3);
}
