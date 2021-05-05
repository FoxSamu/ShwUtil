package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code char} and a {@code long} and returns a {@code double}.
 */
public interface RefCharLong2DoubleFn<P1> {
    double invoke(P1 p1, char p2, long p3);
}
