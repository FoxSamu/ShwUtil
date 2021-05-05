package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code short} and an {@code int} and returns a {@code double}.
 */
public interface RefShortInt2DoubleFn<P1> {
    double invoke(P1 p1, short p2, int p3);
}
