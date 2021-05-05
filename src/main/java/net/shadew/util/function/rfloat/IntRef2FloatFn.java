package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int} and an object and returns a {@code float}.
 */
public interface IntRef2FloatFn<P2> {
    float invoke(int p1, P2 p2);
}
