package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, an object and an object and returns a {@code double}.
 */
public interface CharRefRef2DoubleFn<P2, P3> {
    double invoke(char p1, P2 p2, P3 p3);
}
