package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code long} and returns a {@code float}.
 */
public interface DoubleFloatLong2FloatFn {
    float invoke(double p1, float p2, long p3);
}
