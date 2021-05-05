package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code long} and an object and returns a {@code double}.
 */
public interface ShortLongRef2DoubleFn<P3> {
    double invoke(short p1, long p2, P3 p3);
}
