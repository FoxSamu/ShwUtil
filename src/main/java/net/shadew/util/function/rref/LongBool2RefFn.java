package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long} and a {@code boolean} and returns an object.
 */
public interface LongBool2RefFn<R> {
    R invoke(long p1, boolean p2);
}
