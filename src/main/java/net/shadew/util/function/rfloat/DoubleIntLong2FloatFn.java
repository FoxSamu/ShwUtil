package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, an {@code int} and a {@code long} and returns a {@code float}.
 */
public interface DoubleIntLong2FloatFn {
    float invoke(double p1, int p2, long p3);
}
