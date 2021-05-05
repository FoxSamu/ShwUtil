package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, an object and an {@code int} and returns an {@code int}.
 */
public interface LongRefInt2IntFn<P2> {
    int invoke(long p1, P2 p2, int p3);
}