package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code float} and a {@code float} and returns an object.
 */
public interface ByteFloatFloat2RefFn<R> {
    R invoke(byte p1, float p2, float p3);
}
