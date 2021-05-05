package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code float} and returns an object.
 */
public interface LongFloatFloat2RefFn<R> {
    R invoke(long p1, float p2, float p3);
}
