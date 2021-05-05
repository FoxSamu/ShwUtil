package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, a {@code byte} and an object and returns a {@code float}.
 */
public interface IntByteRef2FloatFn<P3> {
    float invoke(int p1, byte p2, P3 p3);
}
