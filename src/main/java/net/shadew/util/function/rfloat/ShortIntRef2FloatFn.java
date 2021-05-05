package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, an {@code int} and an object and returns a {@code float}.
 */
public interface ShortIntRef2FloatFn<P3> {
    float invoke(short p1, int p2, P3 p3);
}
