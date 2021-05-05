package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, an {@code int} and an object and returns a {@code float}.
 */
public interface BoolIntRef2FloatFn<P3> {
    float invoke(boolean p1, int p2, P3 p3);
}
