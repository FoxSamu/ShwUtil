package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code char} and an object and returns a {@code double}.
 */
public interface LongCharRef2DoubleFn<P3> {
    double invoke(long p1, char p2, P3 p3);
}
