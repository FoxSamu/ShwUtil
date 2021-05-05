package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double} and an object and returns a {@code float}.
 */
public interface DoubleRef2FloatFn<P2> {
    float invoke(double p1, P2 p2);
}
