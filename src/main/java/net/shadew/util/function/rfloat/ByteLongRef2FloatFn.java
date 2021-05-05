package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code byte}, a {@code long} and an object and returns a {@code float}.
 */
public interface ByteLongRef2FloatFn<P3> {
    float invoke(byte p1, long p2, P3 p3);
}
