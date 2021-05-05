package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, a {@code long} and an object and returns a {@code float}.
 */
public interface BoolLongRef2FloatFn<P3> {
    float invoke(boolean p1, long p2, P3 p3);
}
