package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code double} and an {@code int} and returns a {@code float}.
 */
public interface RefDoubleInt2FloatFn<P1> {
    float invoke(P1 p1, double p2, int p3);
}
