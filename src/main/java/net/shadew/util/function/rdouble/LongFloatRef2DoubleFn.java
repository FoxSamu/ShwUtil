package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code float} and an object and returns a {@code double}.
 */
public interface LongFloatRef2DoubleFn<P3> {
    double invoke(Long p1, Float p2, P3 p3);
}
