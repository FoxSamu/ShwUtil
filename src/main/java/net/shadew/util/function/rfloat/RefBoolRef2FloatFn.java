package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code boolean} and an object and returns a {@code float}.
 */
public interface RefBoolRef2FloatFn<P1, P3> {
    float invoke(P1 p1, boolean p2, P3 p3);
}
