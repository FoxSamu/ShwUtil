package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code double} and a {@code long} and returns an object.
 */
public interface LongDoubleLong2RefFn<R> {
    R invoke(long p1, double p2, long p3);
}
