package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code long} and an {@code int} and returns an object.
 */
public interface LongLongInt2RefFn<R> {
    R invoke(long p1, long p2, int p3);
}
