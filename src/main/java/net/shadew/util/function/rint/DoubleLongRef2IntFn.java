package net.shadew.util.function.rint;

/**
 * A function that takes a {@code double}, a {@code long} and an object and returns an {@code int}.
 */
public interface DoubleLongRef2IntFn<P3> {
    int invoke(double p1, long p2, P3 p3);
}
