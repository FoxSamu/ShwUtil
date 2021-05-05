package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an {@code int} and a {@code float} and returns an object.
 */
public interface LongIntFloat2RefFn<R> {
    R invoke(long p1, int p2, float p3);
}
