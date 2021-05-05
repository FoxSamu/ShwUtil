package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code double} and an object and returns a {@code double}.
 */
public interface LongDoubleRef2DoubleFn<P3> {
    double invoke(long p1, double p2, P3 p3);
}
