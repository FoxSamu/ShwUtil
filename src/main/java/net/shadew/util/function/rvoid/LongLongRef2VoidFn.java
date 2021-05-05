package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, a {@code long} and an object and returns nothing.
 */
public interface LongLongRef2VoidFn<P3> {
    void invoke(long p1, long p2, P3 p3);
}