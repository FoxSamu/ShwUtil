package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code char} and a {@code boolean} and returns a {@code float}.
 */
public interface RefCharBool2FloatFn<P1> {
    float invoke(P1 p1, char p2, boolean p3);
}
