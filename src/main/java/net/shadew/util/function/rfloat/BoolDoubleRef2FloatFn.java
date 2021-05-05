package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, a {@code double} and an object and returns a {@code float}.
 */
public interface BoolDoubleRef2FloatFn<P3> {
    float invoke(boolean p1, double p2, P3 p3);
}
