package net.shadew.util.function.rint;

/**
 * A function that takes a {@code double}, an {@code int} and an object and returns an {@code int}.
 */
public interface DoubleIntRef2IntFn<P3> {
    int invoke(double p1, int p2, P3 p3);
}