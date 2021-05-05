package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an {@code int} and a {@code boolean} and returns an object.
 */
public interface ByteIntBool2RefFn<R> {
    R invoke(byte p1, int p2, boolean p3);
}
