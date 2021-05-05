package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code char} and an {@code int} and returns a {@code float}.
 */
public interface RefCharInt2FloatFn<P1> {
    float invoke(P1 p1, char p2, int p3);
}
