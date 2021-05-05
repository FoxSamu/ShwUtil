package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, an object and a {@code double} and returns a {@code float}.
 */
public interface IntRefDouble2FloatFn<P2> {
    float invoke(int p1, P2 p2, double p3);
}
