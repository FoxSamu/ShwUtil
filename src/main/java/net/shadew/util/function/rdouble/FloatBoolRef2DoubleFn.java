package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code boolean} and an object and returns a {@code double}.
 */
public interface FloatBoolRef2DoubleFn<P3> {
    double invoke(float p1, boolean p2, P3 p3);
}
