package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, an object and a {@code float} and returns a {@code float}.
 */
public interface BoolRefFloat2FloatFn<P2> {
    float invoke(boolean p1, P2 p2, float p3);
}
