package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, an object and an object and returns an {@code int}.
 */
public interface LongRefRef2IntFn<P2, P3> {
    int invoke(long p1, P2 p2, P3 p3);
}
