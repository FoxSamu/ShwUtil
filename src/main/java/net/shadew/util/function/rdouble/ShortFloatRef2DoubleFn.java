package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code float} and an object and returns a {@code double}.
 */
public interface ShortFloatRef2DoubleFn<P3> {
    double invoke(short p1, float p2, P3 p3);
}
