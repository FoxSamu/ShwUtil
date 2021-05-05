package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, an object and an object and returns a {@code double}.
 */
public interface IntRefRef2DoubleFn<P2, P3> {
    double invoke(int p1, P2 p2, P3 p3);
}
