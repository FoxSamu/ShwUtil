package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, an object and an object and returns a {@code float}.
 */
public interface LongRefRef2FloatFn<P2, P3> {
    float invoke(long p1, P2 p2, P3 p3);
}
