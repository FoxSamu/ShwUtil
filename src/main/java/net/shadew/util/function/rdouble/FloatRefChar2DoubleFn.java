package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, an object and a {@code char} and returns a {@code double}.
 */
public interface FloatRefChar2DoubleFn<P2> {
    double invoke(float p1, P2 p2, char p3);
}
