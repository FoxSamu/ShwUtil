package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, an object and an {@code int} and returns a {@code float}.
 */
public interface BoolRefInt2FloatFn<P2> {
    float invoke(boolean p1, P2 p2, int p3);
}
