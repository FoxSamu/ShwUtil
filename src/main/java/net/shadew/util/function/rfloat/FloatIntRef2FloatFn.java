package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code float}, an {@code int} and an object and returns a {@code float}.
 */
public interface FloatIntRef2FloatFn<P3> {
    float invoke(float p1, int p2, P3 p3);
}
