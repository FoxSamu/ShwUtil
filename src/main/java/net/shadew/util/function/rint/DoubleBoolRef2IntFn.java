package net.shadew.util.function.rint;

/**
 * A function that takes a {@code double}, a {@code boolean} and an object and returns an {@code int}.
 */
public interface DoubleBoolRef2IntFn<P3> {
    int invoke(double p1, boolean p2, P3 p3);
}
