package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code byte} and returns an object.
 */
public interface LongFloatByte2RefFn<R> {
    R invoke(long p1, float p2, byte p3);
}
