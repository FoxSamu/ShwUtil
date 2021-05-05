package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte} and an {@code int} and returns an object.
 */
public interface ByteInt2RefFn<R> {
    R invoke(byte p1, int p2);
}
