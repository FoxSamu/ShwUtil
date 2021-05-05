package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, a {@code double} and an object and returns a {@code float}.
 */
public interface IntDoubleRef2FloatFn<P3> {
    float invoke(int p1, double p2, P3 p3);
}
