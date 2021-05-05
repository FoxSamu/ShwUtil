package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code boolean} and a {@code long} and returns an object.
 */
public interface LongBoolLong2RefFn<R> {
    R invoke(long p1, boolean p2, long p3);
}
