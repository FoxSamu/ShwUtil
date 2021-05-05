package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code long} and a {@code byte} and returns an object.
 */
public interface LongLongByte2RefFn<R> {
    R invoke(long p1, long p2, byte p3);
}
