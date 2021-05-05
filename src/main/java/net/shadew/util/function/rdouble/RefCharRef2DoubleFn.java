package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code char} and an object and returns a {@code double}.
 */
public interface RefCharRef2DoubleFn<P1, P3> {
    double invoke(P1 p1, char p2, P3 p3);
}
