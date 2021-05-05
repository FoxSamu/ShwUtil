package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, an {@code int} and an object and returns an {@code int}.
 */
public interface LongIntRef2IntFn<P3> {
    int invoke(long p1, int p2, P3 p3);
}
