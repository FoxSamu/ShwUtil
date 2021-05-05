package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, an {@code int} and a {@code double} and returns a {@code float}.
 */
public interface LongIntDouble2FloatFn {
    float invoke(long p1, int p2, double p3);
}
