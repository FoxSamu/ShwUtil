package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code byte}, an {@code int} and an object and returns a {@code float}.
 */
public interface ByteIntRef2FloatFn<P3> {
    float invoke(byte p1, int p2, P3 p3);
}
