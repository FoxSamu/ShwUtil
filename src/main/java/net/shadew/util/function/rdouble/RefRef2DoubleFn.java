package net.shadew.util.function.rdouble;

/**
 * A function that takes an object and an object and returns a {@code double}.
 */
public interface RefRef2DoubleFn<P1, P2> {
    double invoke(P1 p1, P2 p2);
}
