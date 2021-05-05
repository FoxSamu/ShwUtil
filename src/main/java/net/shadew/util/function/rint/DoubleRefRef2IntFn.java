package net.shadew.util.function.rint;

/**
 * A function that takes a {@code double}, an object and an object and returns an {@code int}.
 */
public interface DoubleRefRef2IntFn<P2, P3> {
    int invoke(double p1, P2 p2, P3 p3);
}
