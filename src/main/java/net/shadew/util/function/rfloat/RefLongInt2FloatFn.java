package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code long} and an {@code int} and returns a {@code float}.
 */
public interface RefLongInt2FloatFn<P1> {
    float invoke(P1 p1, long p2, int p3);
}
