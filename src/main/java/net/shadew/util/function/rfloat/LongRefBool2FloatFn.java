package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, an object and a {@code boolean} and returns a {@code float}.
 */
public interface LongRefBool2FloatFn<P2> {
    float invoke(long p1, P2 p2, boolean p3);
}
