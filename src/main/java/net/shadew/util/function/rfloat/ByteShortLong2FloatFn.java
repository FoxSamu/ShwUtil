package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code long} and returns a {@code float}.
 */
public interface ByteShortLong2FloatFn {
    float invoke(byte p1, short p2, long p3);
}
