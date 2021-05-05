package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean} and an object and returns a {@code float}.
 */
public interface BoolRef2FloatFn<P2> {
    float invoke(boolean p1, P2 p2);
}
