package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, an object and a {@code double} and returns a {@code double}.
 */
public interface IntRefDouble2DoubleFn<P2> {
    double invoke(int p1, P2 p2, double p3);
}
