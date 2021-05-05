package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an {@code int} and a {@code boolean} and returns an object.
 */
public interface LongIntBool2RefFn<R> {
    R invoke(long p1, int p2, boolean p3);
}
