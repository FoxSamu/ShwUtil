package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code boolean} and an object and returns a {@code double}.
 */
public interface ShortBoolRef2DoubleFn<P3> {
    double invoke(short p1, boolean p2, P3 p3);
}