package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long} and an object and returns an {@code int}.
 */
public interface LongRef2IntFn<P2> {
    int invoke(long p1, P2 p2);
}
