package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an {@code int} and a {@code float} and returns an object.
 */
public interface ByteIntFloat2RefFn<R> {
    R invoke(byte p1, int p2, float p3);
}
