package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte} and a {@code short} and returns an object.
 */
public interface ByteShort2RefFn<R> {
    R invoke(byte p1, short p2);
}
