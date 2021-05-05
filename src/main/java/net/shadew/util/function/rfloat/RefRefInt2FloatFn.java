package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, an object and an {@code int} and returns a {@code float}.
 */
public interface RefRefInt2FloatFn<P1, P2> {
    float invoke(P1 p1, P2 p2, int p3);
}
