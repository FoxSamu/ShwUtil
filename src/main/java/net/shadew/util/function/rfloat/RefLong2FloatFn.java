package net.shadew.util.function.rfloat;

/**
 * A function that takes an object and a {@code long} and returns a {@code float}.
 */
public interface RefLong2FloatFn<P1> {
    float invoke(P1 p1, long p2);
}
