package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code float} and an object and returns a {@code float}.
 */
public interface FloatRef2FloatFn<P2> {
    float invoke(float p1, P2 p2);
}
