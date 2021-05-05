package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code char}, an {@code int} and an object and returns a {@code float}.
 */
public interface CharIntRef2FloatFn<P3> {
    float invoke(char p1, int p2, P3 p3);
}
