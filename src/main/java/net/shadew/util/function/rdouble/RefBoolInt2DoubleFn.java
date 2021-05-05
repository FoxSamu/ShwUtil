package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code boolean} and an {@code int} and returns a {@code double}.
 */
public interface RefBoolInt2DoubleFn<P1> {
    double invoke(P1 p1, boolean p2, int p3);
}
