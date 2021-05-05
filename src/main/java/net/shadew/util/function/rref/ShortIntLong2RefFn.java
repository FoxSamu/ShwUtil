package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an {@code int} and a {@code long} and returns an object.
 */
public interface ShortIntLong2RefFn<R> {
    R invoke(short p1, int p2, long p3);
}
