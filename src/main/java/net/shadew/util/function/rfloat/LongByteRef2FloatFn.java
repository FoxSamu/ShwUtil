package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code byte} and an object and returns a {@code float}.
 */
public interface LongByteRef2FloatFn<P3> {
    float invoke(long p1, byte p2, P3 p3);
}
