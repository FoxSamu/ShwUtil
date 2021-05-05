package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an {@code int} and an object and returns an object.
 */
public interface LongIntRef2RefFn<P3, R> {
    R invoke(long p1, int p2, P3 p3);
}
