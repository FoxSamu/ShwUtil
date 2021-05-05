package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long} and an object and returns a {@code double}.
 */
public interface LongRef2DoubleFn<P2> {
    double invoke(long p1, P2 p2);
}
