package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, an {@code int} and an object and returns a {@code double}.
 */
public interface ShortIntRef2DoubleFn<P3> {
    double invoke(short p1, int p2, P3 p3);
}
