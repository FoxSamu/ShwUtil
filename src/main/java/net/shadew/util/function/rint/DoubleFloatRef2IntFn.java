package net.shadew.util.function.rint;

/**
 * A function that takes a {@code double}, a {@code float} and an object and returns an {@code int}.
 */
public interface DoubleFloatRef2IntFn<P3> {
    int invoke(double p1, float p2, P3 p3);
}
