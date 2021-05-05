package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code float} and a {@code long} and returns an object.
 */
public interface ByteFloatLong2RefFn<R> {
    R invoke(byte p1, float p2, long p3);
}
