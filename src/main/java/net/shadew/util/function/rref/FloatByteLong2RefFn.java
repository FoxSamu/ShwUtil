package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code byte} and a {@code long} and returns an object.
 */
public interface FloatByteLong2RefFn<R> {
    R invoke(float p1, byte p2, long p3);
}
