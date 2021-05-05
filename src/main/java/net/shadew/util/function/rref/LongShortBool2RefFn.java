package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code boolean} and returns an object.
 */
public interface LongShortBool2RefFn<R> {
    R invoke(long p1, short p2, boolean p3);
}
