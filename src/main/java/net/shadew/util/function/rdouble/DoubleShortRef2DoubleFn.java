package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code short} and an object and returns a {@code double}.
 */
public interface DoubleShortRef2DoubleFn<P3> {
    double invoke(double p1, short p2, P3 p3);
}
