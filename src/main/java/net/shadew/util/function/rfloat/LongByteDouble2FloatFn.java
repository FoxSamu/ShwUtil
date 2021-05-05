package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code double} and returns a {@code float}.
 */
public interface LongByteDouble2FloatFn {
    float invoke(long p1, byte p2, double p3);
}
