package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code byte}, a {@code byte} and an object and returns a {@code float}.
 */
public interface ByteByteRef2FloatFn<P3> {
    float invoke(byte p1, byte p2, P3 p3);
}
