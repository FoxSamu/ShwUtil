package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, a {@code double} and a {@code long} and returns a {@code float}.
 */
public interface IntDoubleLong2FloatFn {
    float invoke(int p1, double p2, long p3);
}
