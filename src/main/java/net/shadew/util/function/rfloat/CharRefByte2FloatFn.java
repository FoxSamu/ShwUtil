package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code char}, an object and a {@code byte} and returns a {@code float}.
 */
public interface CharRefByte2FloatFn<P2> {
    float invoke(char p1, P2 p2, byte p3);
}
