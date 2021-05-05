package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an object and an {@code int} and returns an object.
 */
public interface LongRefInt2RefFn<P2, R> {
    R invoke(long p1, P2 p2, int p3);
}
