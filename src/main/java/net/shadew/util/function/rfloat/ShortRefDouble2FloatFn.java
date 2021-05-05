package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, an object and a {@code double} and returns a {@code float}.
 */
public interface ShortRefDouble2FloatFn<P2> {
    float invoke(short p1, P2 p2, double p3);
}
