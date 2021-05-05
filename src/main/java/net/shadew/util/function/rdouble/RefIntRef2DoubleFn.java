package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, an {@code int} and an object and returns a {@code double}.
 */
public interface RefIntRef2DoubleFn<P1, P3> {
    double invoke(P1 p1, int p2, P3 p3);
}
