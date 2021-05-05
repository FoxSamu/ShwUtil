package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, an object and an object and returns a {@code double}.
 */
public interface RefRefRef2DoubleFn<P1, P2, P3> {
    double invoke(P1 p1, P2 p2, P3 p3);
}
