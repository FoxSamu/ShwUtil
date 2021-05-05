package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code short} and a {@code long} and returns a {@code float}.
 */
public interface RefShortLong2FloatFn<P1> {
    float invoke(P1 p1, short p2, long p3);
}
