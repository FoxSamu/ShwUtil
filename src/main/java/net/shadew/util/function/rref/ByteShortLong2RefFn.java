package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code long} and returns an object.
 */
public interface ByteShortLong2RefFn<R> {
    R invoke(byte p1, short p2, long p3);
}
