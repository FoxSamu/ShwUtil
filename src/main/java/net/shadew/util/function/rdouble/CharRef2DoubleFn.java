package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char} and an object and returns a {@code double}.
 */
public interface CharRef2DoubleFn<P2> {
    double invoke(char p1, P2 p2);
}
