package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, a {@code long} and an object and returns a {@code double}.
 */
public interface CharLongRef2DoubleFn<P3> {
    double invoke(char p1, long p2, P3 p3);
}
