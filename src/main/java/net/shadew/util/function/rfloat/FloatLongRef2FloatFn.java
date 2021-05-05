package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code float}, a {@code long} and an object and returns a {@code float}.
 */
public interface FloatLongRef2FloatFn<P3> {
    float invoke(float p1, long p2, P3 p3);
}
