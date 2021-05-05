package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an {@code int} and a {@code byte} and returns an object.
 */
public interface LongIntByte2RefFn<R> {
    R invoke(long p1, int p2, byte p3);
}
