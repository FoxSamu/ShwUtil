package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code double}, an object and a {@code long} and returns nothing.
 */
public interface DoubleRefLong2VoidFn<P2> {
    void invoke(double p1, P2 p2, long p3);
}
