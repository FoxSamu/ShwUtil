package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code boolean} and a {@code double} and returns an object.
 */
public interface LongBoolDouble2RefFn<R> {
    R invoke(long p1, boolean p2, double p3);
}
