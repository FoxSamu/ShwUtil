package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code double} and an object and returns a {@code double}.
 */
public interface ShortDoubleRef2DoubleFn<P3> {
    double invoke(short p1, double p2, P3 p3);
}
