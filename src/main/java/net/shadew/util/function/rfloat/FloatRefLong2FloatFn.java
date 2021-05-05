package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code float}, an object and a {@code long} and returns a {@code float}.
 */
public interface FloatRefLong2FloatFn<P2> {
    float invoke(float p1, P2 p2, long p3);
}
