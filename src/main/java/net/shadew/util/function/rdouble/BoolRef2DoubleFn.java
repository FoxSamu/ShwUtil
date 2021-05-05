package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean} and an object and returns a {@code double}.
 */
public interface BoolRef2DoubleFn<P2> {
    double invoke(boolean p1, P2 p2);
}
