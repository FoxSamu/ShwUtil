package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, an object and an {@code int} and returns a {@code float}.
 */
public interface IntRefInt2FloatFn<P2> {
    float invoke(int p1, P2 p2, int p3);
}
