package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, an {@code int} and a {@code long} and returns a {@code double}.
 */
public interface RefIntLong2DoubleFn<P1> {
    double invoke(P1 p1, int p2, long p3);
}
