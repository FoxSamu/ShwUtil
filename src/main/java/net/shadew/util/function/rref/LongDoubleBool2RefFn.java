package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code double} and a {@code boolean} and returns an object.
 */
public interface LongDoubleBool2RefFn<R> {
    R invoke(long p1, double p2, boolean p3);
}
