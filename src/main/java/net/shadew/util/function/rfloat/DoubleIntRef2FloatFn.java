package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, an {@code int} and an object and returns a {@code float}.
 */
public interface DoubleIntRef2FloatFn<P3> {
    float invoke(Double p1, Int p2, P3 p3);
}
