package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code short} and returns a {@code float}.
 */
public interface LongByteShort2FloatFn {
    float invoke(Long p1, Byte p2, Short p3);
}
