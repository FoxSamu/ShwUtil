package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code boolean} and an {@code int} and returns an object.
 */
public interface LongBoolInt2RefFn<R> {
    R invoke(long p1, boolean p2, int p3);
}
