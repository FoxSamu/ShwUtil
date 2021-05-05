package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int} and an object and returns a {@code double}.
 */
public interface IntRef2DoubleFn<P2> {
    double invoke(int p1, P2 p2);
}
