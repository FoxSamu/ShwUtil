package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, an object and an {@code int} and returns a {@code float}.
 */
public interface ShortRefInt2FloatFn<P2> {
    float invoke(short p1, P2 p2, int p3);
}
