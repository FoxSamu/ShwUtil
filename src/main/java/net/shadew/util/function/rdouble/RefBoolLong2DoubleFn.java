package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code boolean} and a {@code long} and returns a {@code double}.
 */
public interface RefBoolLong2DoubleFn<P1> {
    double invoke(P1 p1, boolean p2, long p3);
}
