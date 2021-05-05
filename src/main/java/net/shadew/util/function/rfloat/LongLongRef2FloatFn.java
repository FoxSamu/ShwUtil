package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code long} and an object and returns a {@code float}.
 */
public interface LongLongRef2FloatFn<P3> {
    float invoke(long p1, long p2, P3 p3);
}
