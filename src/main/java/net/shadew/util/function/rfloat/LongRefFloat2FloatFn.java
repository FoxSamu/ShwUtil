package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, an object and a {@code float} and returns a {@code float}.
 */
public interface LongRefFloat2FloatFn<P2> {
    float invoke(long p1, P2 p2, float p3);
}
