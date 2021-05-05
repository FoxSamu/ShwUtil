package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, an object and a {@code short} and returns a {@code double}.
 */
public interface DoubleRefShort2DoubleFn<P2> {
    double invoke(double p1, P2 p2, short p3);
}
