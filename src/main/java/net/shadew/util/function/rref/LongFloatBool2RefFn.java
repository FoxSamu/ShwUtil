package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code boolean} and returns an object.
 */
public interface LongFloatBool2RefFn<R> {
    R invoke(long p1, float p2, boolean p3);
}
