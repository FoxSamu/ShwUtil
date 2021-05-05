package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code char}, a {@code byte} and an object and returns a {@code float}.
 */
public interface CharByteRef2FloatFn<P3> {
    float invoke(char p1, byte p2, P3 p3);
}
