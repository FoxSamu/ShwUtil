package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an {@code int} and a {@code double} and returns an object.
 */
public interface LongIntDouble2RefFn<R> {
    R invoke(long p1, int p2, double p3);
}
