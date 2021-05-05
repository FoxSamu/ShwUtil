package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code boolean} and returns a {@code float}.
 */
public interface LongShortBool2FloatFn {
    float invoke(long p1, short p2, boolean p3);
}
