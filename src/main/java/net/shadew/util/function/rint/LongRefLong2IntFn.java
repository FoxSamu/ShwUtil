package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, an object and a {@code long} and returns an {@code int}.
 */
public interface LongRefLong2IntFn<P2> {
    int invoke(long p1, P2 p2, long p3);
}
