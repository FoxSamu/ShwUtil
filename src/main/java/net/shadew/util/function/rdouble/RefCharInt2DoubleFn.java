package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code char} and an {@code int} and returns a {@code double}.
 */
public interface RefCharInt2DoubleFn<P1> {
    double invoke(P1 p1, char p2, int p3);
}
