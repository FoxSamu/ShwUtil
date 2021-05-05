package net.shadew.util.function.rint;

/**
 * A function that takes a {@code double}, an object and a {@code long} and returns an {@code int}.
 */
public interface DoubleRefLong2IntFn<P2> {
    int invoke(double p1, P2 p2, long p3);
}
