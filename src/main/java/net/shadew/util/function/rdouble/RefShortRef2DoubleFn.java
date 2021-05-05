package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code short} and an object and returns a {@code double}.
 */
public interface RefShortRef2DoubleFn<P1, P3> {
    double invoke(P1 p1, short p2, P3 p3);
}
