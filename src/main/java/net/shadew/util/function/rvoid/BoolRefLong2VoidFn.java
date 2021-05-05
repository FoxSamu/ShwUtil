package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code boolean}, an object and a {@code long} and returns nothing.
 */
public interface BoolRefLong2VoidFn<P2> {
    void invoke(boolean p1, P2 p2, long p3);
}
