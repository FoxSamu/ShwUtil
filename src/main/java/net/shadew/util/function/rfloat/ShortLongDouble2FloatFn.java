package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code double} and returns a {@code float}.
 */
public interface ShortLongDouble2FloatFn {
    float invoke(short p1, long p2, double p3);
}
