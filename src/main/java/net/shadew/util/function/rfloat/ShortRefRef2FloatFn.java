package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, an object and an object and returns a {@code float}.
 */
public interface ShortRefRef2FloatFn<P2, P3> {
    float invoke(short p1, P2 p2, P3 p3);
}
