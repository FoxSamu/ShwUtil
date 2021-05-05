package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code char} and a {@code byte} and returns a {@code float}.
 */
public interface RefCharByte2FloatFn<P1> {
    float invoke(P1 p1, char p2, byte p3);
}
