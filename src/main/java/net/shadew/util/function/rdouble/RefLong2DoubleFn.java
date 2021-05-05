package net.shadew.util.function.rdouble;

/**
 * A function that takes an object and a {@code long} and returns a {@code double}.
 */
public interface RefLong2DoubleFn<P1> {
    double invoke(P1 p1, long p2);
}
