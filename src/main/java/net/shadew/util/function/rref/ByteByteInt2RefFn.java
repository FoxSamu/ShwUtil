package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code byte} and an {@code int} and returns an object.
 */
public interface ByteByteInt2RefFn<R> {
    R invoke(byte p1, byte p2, int p3);
}
