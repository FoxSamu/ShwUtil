package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code boolean} and an object and returns a {@code float}.
 */
public interface LongBoolRef2FloatFn<P3> {
    float invoke(long p1, boolean p2, P3 p3);
}
