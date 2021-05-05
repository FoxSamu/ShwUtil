package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, an object and a {@code long} and returns a {@code double}.
 */
public interface CharRefLong2DoubleFn<P2> {
    double invoke(char p1, P2 p2, long p3);
}
