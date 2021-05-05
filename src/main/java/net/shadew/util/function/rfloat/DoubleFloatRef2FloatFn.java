package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, a {@code float} and an object and returns a {@code float}.
 */
public interface DoubleFloatRef2FloatFn<P3> {
    float invoke(double p1, float p2, P3 p3);
}
