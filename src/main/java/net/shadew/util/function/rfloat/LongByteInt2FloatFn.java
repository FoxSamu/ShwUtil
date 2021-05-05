package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code byte} and an {@code int} and returns a {@code float}.
 */
public interface LongByteInt2FloatFn {
    float invoke(long p1, byte p2, int p3);
}