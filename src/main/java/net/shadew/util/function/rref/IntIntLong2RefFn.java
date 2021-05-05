package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an {@code int} and a {@code long} and returns an object.
 */
public interface IntIntLong2RefFn<R> {
    R invoke(int p1, int p2, long p3);
}
