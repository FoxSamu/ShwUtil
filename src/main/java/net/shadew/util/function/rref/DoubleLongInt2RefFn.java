package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code long} and an {@code int} and returns an object.
 */
public interface DoubleLongInt2RefFn<R> {
    R invoke(double p1, long p2, int p3);
}
