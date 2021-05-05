package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code char} and a {@code long} and returns an object.
 */
public interface ByteCharLong2RefFn<R> {
    R invoke(byte p1, char p2, long p3);
}
