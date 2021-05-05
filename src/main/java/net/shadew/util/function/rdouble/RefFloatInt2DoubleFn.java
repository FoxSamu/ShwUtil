package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code float} and an {@code int} and returns a {@code double}.
 */
public interface RefFloatInt2DoubleFn<P1> {
    double invoke(P1 p1, float p2, int p3);
}
