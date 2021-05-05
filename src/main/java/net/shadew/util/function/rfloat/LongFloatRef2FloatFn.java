package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code float} and an object and returns a {@code float}.
 */
public interface LongFloatRef2FloatFn<P3> {
    float invoke(long p1, float p2, P3 p3);
}
