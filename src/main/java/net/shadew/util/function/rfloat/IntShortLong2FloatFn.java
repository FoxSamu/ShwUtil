package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code long} and returns a {@code float}.
 */
public interface IntShortLong2FloatFn {
    float invoke(int p1, short p2, long p3);
}
