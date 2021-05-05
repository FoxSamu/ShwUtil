package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long} and a {@code byte} and returns an object.
 */
public interface LongByte2RefFn<R> {
    R invoke(long p1, byte p2);
}
