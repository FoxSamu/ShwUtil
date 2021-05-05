package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, an object and an {@code int} and returns a {@code double}.
 */
public interface CharRefInt2DoubleFn<P2> {
    double invoke(char p1, P2 p2, int p3);
}
