package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an {@code int} and a {@code long} and returns an object.
 */
public interface ByteIntLong2RefFn<R> {
    R invoke(byte p1, int p2, long p3);
}
