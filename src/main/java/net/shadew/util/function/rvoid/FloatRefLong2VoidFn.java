package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code float}, an object and a {@code long} and returns nothing.
 */
public interface FloatRefLong2VoidFn<P2> {
    void invoke(float p1, P2 p2, long p3);
}
