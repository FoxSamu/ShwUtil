package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, an object and a {@code byte} and returns a {@code float}.
 */
public interface LongRefByte2FloatFn<P2> {
    float invoke(long p1, P2 p2, byte p3);
}
