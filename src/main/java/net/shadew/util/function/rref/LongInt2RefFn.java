package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long} and an {@code int} and returns an object.
 */
public interface LongInt2RefFn<R> {
    R invoke(long p1, int p2);
}
