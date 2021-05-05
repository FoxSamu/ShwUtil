package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, an {@code int} and an object and returns a {@code double}.
 */
public interface BoolIntRef2DoubleFn<P3> {
    double invoke(boolean p1, int p2, P3 p3);
}
