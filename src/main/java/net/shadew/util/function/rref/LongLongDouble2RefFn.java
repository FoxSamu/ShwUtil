package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code long} and a {@code double} and returns an object.
 */
public interface LongLongDouble2RefFn<R> {
    R invoke(long p1, long p2, double p3);
}
