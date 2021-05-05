package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code byte} and returns an object.
 */
public interface LongShortByte2RefFn<R> {
    R invoke(long p1, short p2, byte p3);
}
