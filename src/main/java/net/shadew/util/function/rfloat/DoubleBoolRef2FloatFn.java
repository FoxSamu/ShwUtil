package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, a {@code boolean} and an object and returns a {@code float}.
 */
public interface DoubleBoolRef2FloatFn<P3> {
    float invoke(double p1, boolean p2, P3 p3);
}
