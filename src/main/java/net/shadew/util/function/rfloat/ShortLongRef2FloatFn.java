package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, a {@code long} and an object and returns a {@code float}.
 */
public interface ShortLongRef2FloatFn<P3> {
    float invoke(short p1, long p2, P3 p3);
}
