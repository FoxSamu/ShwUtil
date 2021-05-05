package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code double} and returns a {@code float}.
 */
public interface IntLongDouble2FloatFn {
    float invoke(int p1, long p2, double p3);
}
