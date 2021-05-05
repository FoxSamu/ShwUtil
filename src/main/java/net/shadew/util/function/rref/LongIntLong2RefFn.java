package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an {@code int} and a {@code long} and returns an object.
 */
public interface LongIntLong2RefFn<R> {
    R invoke(long p1, int p2, long p3);
}
