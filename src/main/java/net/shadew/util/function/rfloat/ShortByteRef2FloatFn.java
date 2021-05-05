package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, a {@code byte} and an object and returns a {@code float}.
 */
public interface ShortByteRef2FloatFn<P3> {
    float invoke(short p1, byte p2, P3 p3);
}
