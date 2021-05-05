package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code byte}, a {@code short} and an object and returns a {@code float}.
 */
public interface ByteShortRef2FloatFn<P3> {
    float invoke(byte p1, short p2, P3 p3);
}
