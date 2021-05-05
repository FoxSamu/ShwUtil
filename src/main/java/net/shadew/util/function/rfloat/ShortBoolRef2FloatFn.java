package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, a {@code boolean} and an object and returns a {@code float}.
 */
public interface ShortBoolRef2FloatFn<P3> {
    float invoke(short p1, boolean p2, P3 p3);
}
