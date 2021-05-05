package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, an object and an object and returns a {@code float}.
 */
public interface IntRefRef2FloatFn<P2, P3> {
    float invoke(int p1, P2 p2, P3 p3);
}
