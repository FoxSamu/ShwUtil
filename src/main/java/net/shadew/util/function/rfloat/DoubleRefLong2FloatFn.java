package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, an object and a {@code long} and returns a {@code float}.
 */
public interface DoubleRefLong2FloatFn<P2> {
    float invoke(double p1, P2 p2, long p3);
}
