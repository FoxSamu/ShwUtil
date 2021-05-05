package net.shadew.util.function.rint;

/**
 * A function that takes a {@code float}, a {@code double} and an object and returns an {@code int}.
 */
public interface FloatDoubleRef2IntFn<P3> {
    int invoke(float p1, double p2, P3 p3);
}
