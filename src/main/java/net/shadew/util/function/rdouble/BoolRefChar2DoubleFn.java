package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, an object and a {@code char} and returns a {@code double}.
 */
public interface BoolRefChar2DoubleFn<P2> {
    double invoke(boolean p1, P2 p2, char p3);
}
