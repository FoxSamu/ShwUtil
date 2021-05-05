package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, a {@code short} and an object and returns a {@code float}.
 */
public interface IntShortRef2FloatFn<P3> {
    float invoke(int p1, short p2, P3 p3);
}
