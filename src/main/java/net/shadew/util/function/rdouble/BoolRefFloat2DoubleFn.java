package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, an object and a {@code float} and returns a {@code double}.
 */
public interface BoolRefFloat2DoubleFn<P2> {
    double invoke(boolean p1, P2 p2, float p3);
}