package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float} and an object and returns a {@code double}.
 */
public interface FloatRef2DoubleFn<P2> {
    double invoke(float p1, P2 p2);
}
