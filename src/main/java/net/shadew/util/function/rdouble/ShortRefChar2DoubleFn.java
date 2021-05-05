package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, an object and a {@code char} and returns a {@code double}.
 */
public interface ShortRefChar2DoubleFn<P2> {
    double invoke(short p1, P2 p2, char p3);
}
