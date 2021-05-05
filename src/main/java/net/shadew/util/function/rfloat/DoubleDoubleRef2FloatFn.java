package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, a {@code double} and an object and returns a {@code float}.
 */
public interface DoubleDoubleRef2FloatFn<P3> {
    float invoke(double p1, double p2, P3 p3);
}
