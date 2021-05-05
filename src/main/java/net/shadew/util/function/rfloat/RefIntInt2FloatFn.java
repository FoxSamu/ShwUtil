package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, an {@code int} and an {@code int} and returns a {@code float}.
 */
public interface RefIntInt2FloatFn<P1> {
    float invoke(P1 p1, int p2, int p3);
}
