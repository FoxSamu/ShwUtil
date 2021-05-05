package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, an {@code int} and an object and returns a {@code double}.
 */
public interface IntIntRef2DoubleFn<P3> {
    double invoke(int p1, int p2, P3 p3);
}
