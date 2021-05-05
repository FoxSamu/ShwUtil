package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code long} and a {@code boolean} and returns a {@code float}.
 */
public interface RefLongBool2FloatFn<P1> {
    float invoke(P1 p1, long p2, boolean p3);
}
