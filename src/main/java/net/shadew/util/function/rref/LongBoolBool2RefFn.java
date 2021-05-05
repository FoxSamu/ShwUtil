package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code boolean} and a {@code boolean} and returns an object.
 */
public interface LongBoolBool2RefFn<R> {
    R invoke(long p1, boolean p2, boolean p3);
}
