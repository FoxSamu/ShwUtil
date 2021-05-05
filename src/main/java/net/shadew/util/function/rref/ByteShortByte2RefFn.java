package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code byte} and returns an object.
 */
public interface ByteShortByte2RefFn<R> {
    R invoke(byte p1, short p2, byte p3);
}
