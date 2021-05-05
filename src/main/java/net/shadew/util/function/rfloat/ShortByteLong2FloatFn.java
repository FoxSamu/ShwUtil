package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code long} and returns a {@code float}.
 */
public interface ShortByteLong2FloatFn {
    float invoke(short p1, byte p2, long p3);
}
