package net.shadew.util.function.rint;

/**
 * A function that takes a {@code byte}, a {@code float} and an object and returns an {@code int}.
 */
public interface ByteFloatRef2IntFn<P3> {
    int invoke(byte p1, float p2, P3 p3);
}