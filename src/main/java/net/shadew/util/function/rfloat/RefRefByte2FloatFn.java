package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, an object and a {@code byte} and returns a {@code float}.
 */
public interface RefRefByte2FloatFn<P1, P2> {
    float invoke(P1 p1, P2 p2, byte p3);
}
