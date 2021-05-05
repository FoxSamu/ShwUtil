package net.shadew.util.function.rfloat;

/**
 * A function that takes an object and a {@code boolean} and returns a {@code float}.
 */
public interface RefBool2FloatFn<P1> {
    float invoke(P1 p1, boolean p2);
}
