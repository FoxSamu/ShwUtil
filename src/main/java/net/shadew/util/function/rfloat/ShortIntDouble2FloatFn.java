package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, an {@code int} and a {@code double} and returns a {@code float}.
 */
public interface ShortIntDouble2FloatFn {
    float invoke(short p1, int p2, double p3);
}