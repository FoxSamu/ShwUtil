package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, a {@code float} and an object and returns a {@code float}.
 */
public interface ShortFloatRef2FloatFn<P3> {
    float invoke(short p1, float p2, P3 p3);
}
