package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an {@code int} and a {@code byte} and returns an object.
 */
public interface ByteIntByte2RefFn<R> {
    R invoke(byte p1, int p2, byte p3);
}
