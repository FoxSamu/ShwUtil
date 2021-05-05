package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, an object and an {@code int} and returns a {@code float}.
 */
public interface DoubleRefInt2FloatFn<P2> {
    float invoke(double p1, P2 p2, int p3);
}
