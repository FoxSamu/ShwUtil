package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, an object and an object and returns a {@code float}.
 */
public interface BoolRefRef2FloatFn<P2, P3> {
    float invoke(boolean p1, P2 p2, P3 p3);
}
