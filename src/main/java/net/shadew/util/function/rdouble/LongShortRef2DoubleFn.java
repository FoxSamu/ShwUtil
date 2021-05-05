package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code short} and an object and returns a {@code double}.
 */
public interface LongShortRef2DoubleFn<P3> {
    double invoke(long p1, short p2, P3 p3);
}
