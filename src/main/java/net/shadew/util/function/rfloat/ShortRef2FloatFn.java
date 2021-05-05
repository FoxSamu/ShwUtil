package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short} and an object and returns a {@code float}.
 */
public interface ShortRef2FloatFn<P2> {
    float invoke(short p1, P2 p2);
}
