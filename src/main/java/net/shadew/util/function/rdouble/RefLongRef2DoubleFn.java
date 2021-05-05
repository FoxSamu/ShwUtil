package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code long} and an object and returns a {@code double}.
 */
public interface RefLongRef2DoubleFn<P1, P3> {
    double invoke(P1 p1, long p2, P3 p3);
}
