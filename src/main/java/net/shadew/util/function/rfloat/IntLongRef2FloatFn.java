package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, a {@code long} and an object and returns a {@code float}.
 */
public interface IntLongRef2FloatFn<P3> {
    float invoke(int p1, long p2, P3 p3);
}
