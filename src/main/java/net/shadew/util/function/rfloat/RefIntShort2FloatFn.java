package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, an {@code int} and a {@code short} and returns a {@code float}.
 */
public interface RefIntShort2FloatFn<P1> {
    float invoke(P1 p1, int p2, short p3);
}
