package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code double} and a {@code long} and returns an object.
 */
public interface ByteDoubleLong2RefFn<R> {
    R invoke(byte p1, double p2, long p3);
}
