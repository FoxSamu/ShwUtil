package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code long} and returns a {@code float}.
 */
public interface LongShortLong2FloatFn {
    float invoke(long p1, short p2, long p3);
}