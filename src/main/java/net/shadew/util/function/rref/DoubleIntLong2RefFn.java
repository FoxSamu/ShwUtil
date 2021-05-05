package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an {@code int} and a {@code long} and returns an object.
 */
public interface DoubleIntLong2RefFn<R> {
    R invoke(double p1, int p2, long p3);
}
