package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long} and an object and returns a {@code float}.
 */
public interface LongRef2FloatFn<P2> {
    float invoke(long p1, P2 p2);
}
