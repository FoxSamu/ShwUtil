package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, an object and an {@code int} and returns a {@code float}.
 */
public interface LongRefInt2FloatFn<P2> {
    float invoke(long p1, P2 p2, int p3);
}
