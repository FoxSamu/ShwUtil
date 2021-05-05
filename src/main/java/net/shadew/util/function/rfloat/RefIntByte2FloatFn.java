package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, an {@code int} and a {@code byte} and returns a {@code float}.
 */
public interface RefIntByte2FloatFn<P1> {
    float invoke(P1 p1, int p2, byte p3);
}
