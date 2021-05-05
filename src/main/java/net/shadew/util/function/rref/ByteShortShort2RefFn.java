package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code short} and returns an object.
 */
public interface ByteShortShort2RefFn<R> {
    R invoke(byte p1, short p2, short p3);
}
