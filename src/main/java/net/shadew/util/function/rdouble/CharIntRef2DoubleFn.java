package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, an {@code int} and an object and returns a {@code double}.
 */
public interface CharIntRef2DoubleFn<P3> {
    double invoke(char p1, int p2, P3 p3);
}
