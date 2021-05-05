package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code byte} and a {@code short} and returns an object.
 */
public interface ByteByteShort2RefFn<R> {
    R invoke(byte p1, byte p2, short p3);
}
