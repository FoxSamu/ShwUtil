package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, a {@code long} and an object and returns an {@code int}.
 */
public interface LongLongRef2IntFn<P3> {
    int invoke(long p1, long p2, P3 p3);
}
