package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code char} and an object and returns a {@code double}.
 */
public interface FloatCharRef2DoubleFn<P3> {
    double invoke(float p1, char p2, P3 p3);
}
