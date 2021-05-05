package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, an object and a {@code byte} and returns a {@code float}.
 */
public interface IntRefByte2FloatFn<P2> {
    float invoke(int p1, P2 p2, byte p3);
}
