package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code long} and a {@code boolean} and returns an object.
 */
public interface LongLongBool2RefFn<R> {
    R invoke(long p1, long p2, boolean p3);
}
