package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code float} and an object and returns a {@code double}.
 */
public interface LongFloatRef2DoubleFn<P3> {
    double invoke(long p1, float p2, P3 p3);
}
