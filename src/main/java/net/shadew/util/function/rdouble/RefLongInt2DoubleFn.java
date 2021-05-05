package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code long} and an {@code int} and returns a {@code double}.
 */
public interface RefLongInt2DoubleFn<P1> {
    double invoke(P1 p1, long p2, int p3);
}
