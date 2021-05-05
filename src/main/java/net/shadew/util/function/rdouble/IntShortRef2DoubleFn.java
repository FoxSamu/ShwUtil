package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code short} and an object and returns a {@code double}.
 */
public interface IntShortRef2DoubleFn<P3> {
    double invoke(int p1, short p2, P3 p3);
}
