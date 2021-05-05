package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, an object and a {@code short} and returns a {@code double}.
 */
public interface BoolRefShort2DoubleFn<P2> {
    double invoke(boolean p1, P2 p2, short p3);
}
