package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, an {@code int} and an object and returns a {@code float}.
 */
public interface RefIntRef2FloatFn<P1, P3> {
    float invoke(P1 p1, int p2, P3 p3);
}
