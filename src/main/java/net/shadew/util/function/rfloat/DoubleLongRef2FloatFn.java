package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, a {@code long} and an object and returns a {@code float}.
 */
public interface DoubleLongRef2FloatFn<P3> {
    float invoke(double p1, long p2, P3 p3);
}
