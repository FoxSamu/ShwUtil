package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, an {@code int} and an object and returns a {@code double}.
 */
public interface FloatIntRef2DoubleFn<P3> {
    double invoke(float p1, int p2, P3 p3);
}
