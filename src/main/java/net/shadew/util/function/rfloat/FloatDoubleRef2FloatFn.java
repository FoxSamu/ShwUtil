package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code float}, a {@code double} and an object and returns a {@code float}.
 */
public interface FloatDoubleRef2FloatFn<P3> {
    float invoke(float p1, double p2, P3 p3);
}
