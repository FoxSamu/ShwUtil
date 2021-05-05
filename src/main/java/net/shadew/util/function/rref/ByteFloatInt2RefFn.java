package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code float} and an {@code int} and returns an object.
 */
public interface ByteFloatInt2RefFn<R> {
    R invoke(byte p1, float p2, int p3);
}
