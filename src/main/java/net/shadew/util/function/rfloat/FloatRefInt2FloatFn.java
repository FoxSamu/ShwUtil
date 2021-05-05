package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code float}, an object and an {@code int} and returns a {@code float}.
 */
public interface FloatRefInt2FloatFn<P2> {
    float invoke(float p1, P2 p2, int p3);
}
