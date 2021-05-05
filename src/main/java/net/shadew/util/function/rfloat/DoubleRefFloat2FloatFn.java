package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, an object and a {@code float} and returns a {@code float}.
 */
public interface DoubleRefFloat2FloatFn<P2> {
    float invoke(double p1, P2 p2, float p3);
}
