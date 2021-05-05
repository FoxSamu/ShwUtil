package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, an object and an {@code int} and returns nothing.
 */
public interface LongRefInt2VoidFn<P2> {
    void invoke(long p1, P2 p2, int p3);
}
