package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code long} and a {@code long} and returns an object.
 */
public interface LongLongLong2RefFn<R> {
    R invoke(long p1, long p2, long p3);
}
