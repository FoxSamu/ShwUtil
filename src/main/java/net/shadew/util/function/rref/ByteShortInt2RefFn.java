package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code short} and an {@code int} and returns an object.
 */
public interface ByteShortInt2RefFn<R> {
    R invoke(byte p1, short p2, int p3);
}
