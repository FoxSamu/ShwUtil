package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, an {@code int} and an {@code int} and returns a {@code double}.
 */
public interface RefIntInt2DoubleFn<P1> {
    double invoke(P1 p1, int p2, int p3);
}
