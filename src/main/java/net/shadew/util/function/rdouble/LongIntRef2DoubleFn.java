package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, an {@code int} and an object and returns a {@code double}.
 */
public interface LongIntRef2DoubleFn<P3> {
    double invoke(long p1, int p2, P3 p3);
}
