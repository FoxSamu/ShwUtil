package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code char} and a {@code long} and returns an object.
 */
public interface LongCharLong2RefFn<R> {
    R invoke(long p1, char p2, long p3);
}
