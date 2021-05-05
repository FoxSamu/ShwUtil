package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code char}, an object and an {@code int} and returns a {@code float}.
 */
public interface CharRefInt2FloatFn<P2> {
    float invoke(char p1, P2 p2, int p3);
}
