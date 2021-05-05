package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code double} and an {@code int} and returns an object.
 */
public interface LongDoubleInt2RefFn<R> {
    R invoke(long p1, double p2, int p3);
}
