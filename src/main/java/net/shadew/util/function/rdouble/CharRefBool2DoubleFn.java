package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, an object and a {@code boolean} and returns a {@code double}.
 */
public interface CharRefBool2DoubleFn<P2> {
    double invoke(char p1, P2 p2, boolean p3);
}
