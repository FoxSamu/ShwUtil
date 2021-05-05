package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, a {@code float} and an object and returns a {@code float}.
 */
public interface IntFloatRef2FloatFn<P3> {
    float invoke(int p1, float p2, P3 p3);
}
