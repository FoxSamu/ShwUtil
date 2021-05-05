package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code float}, a {@code long} and a {@code double} and returns a {@code float}.
 */
public interface FloatLongDouble2FloatFn {
    float invoke(float p1, long p2, double p3);
}
