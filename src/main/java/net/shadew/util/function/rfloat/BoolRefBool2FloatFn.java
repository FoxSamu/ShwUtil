package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, an object and a {@code boolean} and returns a {@code float}.
 */
public interface BoolRefBool2FloatFn<P2> {
    float invoke(boolean p1, P2 p2, boolean p3);
}
