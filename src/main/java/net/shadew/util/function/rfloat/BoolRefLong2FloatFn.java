package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, an object and a {@code long} and returns a {@code float}.
 */
public interface BoolRefLong2FloatFn<P2> {
    float invoke(boolean p1, P2 p2, long p3);
}
