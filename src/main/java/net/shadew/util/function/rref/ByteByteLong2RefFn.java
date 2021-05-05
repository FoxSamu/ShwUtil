package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code byte} and a {@code long} and returns an object.
 */
public interface ByteByteLong2RefFn<R> {
    R invoke(byte p1, byte p2, long p3);
}
