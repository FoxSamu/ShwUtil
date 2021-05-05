package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code float} and an object and returns a {@code double}.
 */
public interface RefFloatRef2DoubleFn<P1, P3> {
    double invoke(P1 p1, float p2, P3 p3);
}
