package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code double} and an object and returns a {@code float}.
 */
public interface LongDoubleRef2FloatFn<P3> {
    float invoke(Long p1, Double p2, P3 p3);
}
