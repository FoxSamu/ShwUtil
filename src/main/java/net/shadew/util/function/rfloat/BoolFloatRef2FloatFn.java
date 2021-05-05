package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, a {@code float} and an object and returns a {@code float}.
 */
public interface BoolFloatRef2FloatFn<P3> {
    float invoke(boolean p1, float p2, P3 p3);
}
