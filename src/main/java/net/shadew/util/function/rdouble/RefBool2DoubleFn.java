package net.shadew.util.function.rdouble;

/**
 * A function that takes an object and a {@code boolean} and returns a {@code double}.
 */
public interface RefBool2DoubleFn<P1> {
    double invoke(P1 p1, boolean p2);
}
