package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code long} and an object and returns a {@code double}.
 */
public interface DoubleLongRef2DoubleFn<P3> {
    double invoke(double p1, long p2, P3 p3);
}
