package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code char} and returns a {@code float}.
 */
public interface ShortByteChar2FloatFn {
    float invoke(short p1, byte p2, char p3);
}