package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code long} and an object and returns a {@code double}.
 */
public interface FloatLongRef2DoubleFn<P3> {
    double invoke(float p1, long p2, P3 p3);
}
