package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code byte} and a {@code long} and returns a {@code float}.
 */
public interface RefByteLong2FloatFn<P1> {
    float invoke(P1 p1, byte p2, long p3);
}
