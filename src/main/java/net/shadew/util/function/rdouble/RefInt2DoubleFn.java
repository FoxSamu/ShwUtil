package net.shadew.util.function.rdouble;

/**
 * A function that takes an object and an {@code int} and returns a {@code double}.
 */
public interface RefInt2DoubleFn<P1> {
    double invoke(P1 p1, int p2);
}
