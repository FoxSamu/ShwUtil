package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code short} and an object and returns a {@code float}.
 */
public interface LongShortRef2FloatFn<P3> {
    float invoke(long p1, short p2, P3 p3);
}
