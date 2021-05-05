package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code float}, a {@code byte} and an object and returns a {@code float}.
 */
public interface FloatByteRef2FloatFn<P3> {
    float invoke(float p1, byte p2, P3 p3);
}
