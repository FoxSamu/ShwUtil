package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, an object and an object and returns a {@code float}.
 */
public interface RefRefRef2FloatFn<P1, P2, P3> {
    float invoke(P1 p1, P2 p2, P3 p3);
}
