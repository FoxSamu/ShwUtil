package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, an object and a {@code boolean} and returns a {@code float}.
 */
public interface DoubleRefBool2FloatFn<P2> {
    float invoke(double p1, P2 p2, boolean p3);
}
