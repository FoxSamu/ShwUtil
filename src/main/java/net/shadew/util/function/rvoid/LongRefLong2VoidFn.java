package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, an object and a {@code long} and returns nothing.
 */
public interface LongRefLong2VoidFn<P2> {
    void invoke(long p1, P2 p2, long p3);
}
