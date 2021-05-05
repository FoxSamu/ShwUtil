package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, an {@code int} and a {@code long} and returns a {@code double}.
 */
public interface FloatIntLong2DoubleFn {
    double invoke(float p1, int p2, long p3);
}
