package net.shadew.util.function.rint;

/**
 * A function that takes a {@code double}, an object and a {@code boolean} and returns an {@code int}.
 */
public interface DoubleRefBool2IntFn<P2> {
    int invoke(double p1, P2 p2, boolean p3);
}
