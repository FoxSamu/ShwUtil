package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code long} and returns an object.
 */
public interface LongFloatLong2RefFn<R> {
    R invoke(long p1, float p2, long p3);
}
