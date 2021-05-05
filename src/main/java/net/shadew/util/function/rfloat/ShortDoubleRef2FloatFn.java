package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, a {@code double} and an object and returns a {@code float}.
 */
public interface ShortDoubleRef2FloatFn<P3> {
    float invoke(short p1, double p2, P3 p3);
}
