package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an {@code int} and an {@code int} and returns an object.
 */
public interface LongIntInt2RefFn<R> {
    R invoke(long p1, int p2, int p3);
}
