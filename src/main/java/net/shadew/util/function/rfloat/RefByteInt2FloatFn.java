package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code byte} and an {@code int} and returns a {@code float}.
 */
public interface RefByteInt2FloatFn<P1> {
    float invoke(P1 p1, byte p2, int p3);
}
