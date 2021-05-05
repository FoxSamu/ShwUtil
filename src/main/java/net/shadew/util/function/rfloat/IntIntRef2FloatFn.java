package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, an {@code int} and an object and returns a {@code float}.
 */
public interface IntIntRef2FloatFn<P3> {
    float invoke(int p1, int p2, P3 p3);
}
