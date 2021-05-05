package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code byte} and returns a {@code float}.
 */
public interface LongShortByte2FloatFn {
    float invoke(long p1, short p2, byte p3);
}
