package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code short} and returns a {@code float}.
 */
public interface LongFloatShort2FloatFn {
    float invoke(long p1, float p2, short p3);
}