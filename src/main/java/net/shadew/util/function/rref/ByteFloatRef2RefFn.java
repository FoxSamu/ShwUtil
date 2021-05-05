package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code float} and an object and returns an object.
 */
public interface ByteFloatRef2RefFn<P3, R> {
    R invoke(byte p1, float p2, P3 p3);
}
