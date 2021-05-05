package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, a {@code short} and an object and returns a {@code float}.
 */
public interface DoubleShortRef2FloatFn<P3> {
    float invoke(double p1, short p2, P3 p3);
}
