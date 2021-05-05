package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an {@code int} and a {@code short} and returns an object.
 */
public interface ByteIntShort2RefFn<R> {
    R invoke(byte p1, int p2, short p3);
}
