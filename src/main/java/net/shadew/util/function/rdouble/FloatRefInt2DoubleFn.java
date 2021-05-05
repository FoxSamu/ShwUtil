package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, an object and an {@code int} and returns a {@code double}.
 */
public interface FloatRefInt2DoubleFn<P2> {
    double invoke(float p1, P2 p2, int p3);
}
