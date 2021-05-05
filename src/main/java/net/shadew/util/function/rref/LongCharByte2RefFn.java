package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code char} and a {@code byte} and returns an object.
 */
public interface LongCharByte2RefFn<R> {
    R invoke(long p1, char p2, byte p3);
}
