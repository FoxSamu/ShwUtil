package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, an {@code int} and an object and returns nothing.
 */
public interface LongIntRef2VoidFn<P3> {
    void invoke(long p1, int p2, P3 p3);
}
