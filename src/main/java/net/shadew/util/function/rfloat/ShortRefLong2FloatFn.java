package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, an object and a {@code long} and returns a {@code float}.
 */
public interface ShortRefLong2FloatFn<P2> {
    float invoke(short p1, P2 p2, long p3);
}
