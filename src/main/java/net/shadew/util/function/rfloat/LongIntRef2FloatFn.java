package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, an {@code int} and an object and returns a {@code float}.
 */
public interface LongIntRef2FloatFn<P3> {
    float invoke(long p1, int p2, P3 p3);
}
