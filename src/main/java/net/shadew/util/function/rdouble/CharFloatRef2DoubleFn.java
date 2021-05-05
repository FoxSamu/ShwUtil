package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, a {@code float} and an object and returns a {@code double}.
 */
public interface CharFloatRef2DoubleFn<P3> {
    double invoke(char p1, float p2, P3 p3);
}
