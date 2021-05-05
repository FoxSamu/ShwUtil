package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code double} and an object and returns a {@code double}.
 */
public interface IntDoubleRef2DoubleFn<P3> {
    double invoke(Int p1, Double p2, P3 p3);
}
