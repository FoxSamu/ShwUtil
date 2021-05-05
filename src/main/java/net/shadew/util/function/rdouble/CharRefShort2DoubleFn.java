package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, an object and a {@code short} and returns a {@code double}.
 */
public interface CharRefShort2DoubleFn<P2> {
    double invoke(char p1, P2 p2, short p3);
}
