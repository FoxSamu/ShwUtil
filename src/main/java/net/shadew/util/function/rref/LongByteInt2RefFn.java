package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code byte} and an {@code int} and returns an object.
 */
public interface LongByteInt2RefFn<R> {
    R invoke(long p1, byte p2, int p3);
}
