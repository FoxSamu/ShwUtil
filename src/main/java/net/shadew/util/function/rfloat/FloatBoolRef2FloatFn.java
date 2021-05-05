package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code float}, a {@code boolean} and an object and returns a {@code float}.
 */
public interface FloatBoolRef2FloatFn<P3> {
    float invoke(float p1, boolean p2, P3 p3);
}
