package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code byte}, a {@code double} and an object and returns a {@code float}.
 */
public interface ByteDoubleRef2FloatFn<P3> {
    float invoke(byte p1, double p2, P3 p3);
}
