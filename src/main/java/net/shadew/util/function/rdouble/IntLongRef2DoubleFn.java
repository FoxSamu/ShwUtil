package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code long} and an object and returns a {@code double}.
 */
public interface IntLongRef2DoubleFn<P3> {
    double invoke(int p1, long p2, P3 p3);
}
