package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, an object and an {@code int} and returns a {@code double}.
 */
public interface RefRefInt2DoubleFn<P1, P2> {
    double invoke(P1 p1, P2 p2, int p3);
}
