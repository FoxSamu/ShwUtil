package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code double} and a {@code long} and returns a {@code float}.
 */
public interface RefDoubleLong2FloatFn<P1> {
    float invoke(P1 p1, double p2, long p3);
}
