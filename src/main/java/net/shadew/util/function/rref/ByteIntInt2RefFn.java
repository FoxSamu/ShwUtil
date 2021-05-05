package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an {@code int} and an {@code int} and returns an object.
 */
public interface ByteIntInt2RefFn<R> {
    R invoke(byte p1, int p2, int p3);
}
