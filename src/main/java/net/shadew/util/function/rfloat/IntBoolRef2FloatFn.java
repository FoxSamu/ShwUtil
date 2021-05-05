package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, a {@code boolean} and an object and returns a {@code float}.
 */
public interface IntBoolRef2FloatFn<P3> {
    float invoke(int p1, boolean p2, P3 p3);
}
