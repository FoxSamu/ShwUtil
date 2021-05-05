package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code double} and returns an object.
 */
public interface LongFloatDouble2RefFn<R> {
    R invoke(long p1, float p2, double p3);
}
