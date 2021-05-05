package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, an object and a {@code boolean} and returns a {@code double}.
 */
public interface BoolRefBool2DoubleFn<P2> {
    double invoke(boolean p1, P2 p2, boolean p3);
}
