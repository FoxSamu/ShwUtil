package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, an object and an object and returns nothing.
 */
public interface LongRefRef2VoidFn<P2, P3> {
    void invoke(Long p1, P2 p2, P3 p3);
}
