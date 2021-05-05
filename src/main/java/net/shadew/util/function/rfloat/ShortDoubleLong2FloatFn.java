package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, a {@code double} and a {@code long} and returns a {@code float}.
 */
public interface ShortDoubleLong2FloatFn {
    float invoke(short p1, double p2, long p3);
}
