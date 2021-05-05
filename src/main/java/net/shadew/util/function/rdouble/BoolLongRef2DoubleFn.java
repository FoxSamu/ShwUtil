package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, a {@code long} and an object and returns a {@code double}.
 */
public interface BoolLongRef2DoubleFn<P3> {
    double invoke(boolean p1, long p2, P3 p3);
}
