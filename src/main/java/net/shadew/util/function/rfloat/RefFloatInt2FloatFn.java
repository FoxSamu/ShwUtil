package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code float} and an {@code int} and returns a {@code float}.
 */
public interface RefFloatInt2FloatFn<P1> {
    float invoke(P1 p1, float p2, int p3);
}
