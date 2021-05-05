package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, an object and an {@code int} and returns a {@code double}.
 */
public interface BoolRefInt2DoubleFn<P2> {
    double invoke(boolean p1, P2 p2, int p3);
}
