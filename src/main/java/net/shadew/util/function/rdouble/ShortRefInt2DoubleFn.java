package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, an object and an {@code int} and returns a {@code double}.
 */
public interface ShortRefInt2DoubleFn<P2> {
    double invoke(short p1, P2 p2, int p3);
}
