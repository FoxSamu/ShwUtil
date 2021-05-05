package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code float} and a {@code long} and returns a {@code float}.
 */
public interface RefFloatLong2FloatFn<P1> {
    float invoke(P1 p1, float p2, long p3);
}
