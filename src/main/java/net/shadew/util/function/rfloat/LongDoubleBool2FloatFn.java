package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code double} and a {@code boolean} and returns a {@code float}.
 */
public interface LongDoubleBool2FloatFn {
    float invoke(long p1, double p2, boolean p3);
}
