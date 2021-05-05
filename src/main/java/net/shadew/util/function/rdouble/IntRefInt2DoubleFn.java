package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, an object and an {@code int} and returns a {@code double}.
 */
public interface IntRefInt2DoubleFn<P2> {
    double invoke(int p1, P2 p2, int p3);
}
