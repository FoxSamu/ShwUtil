package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code double} and returns a {@code float}.
 */
public interface LongShortDouble2FloatFn {
    float invoke(long p1, short p2, double p3);
}
