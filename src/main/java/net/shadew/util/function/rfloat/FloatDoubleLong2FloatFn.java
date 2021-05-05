package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code float}, a {@code double} and a {@code long} and returns a {@code float}.
 */
public interface FloatDoubleLong2FloatFn {
    float invoke(float p1, double p2, long p3);
}
