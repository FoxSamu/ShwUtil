package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code double}, a {@code long} and an object and returns nothing.
 */
public interface DoubleLongRef2VoidFn<P3> {
    void invoke(double p1, long p2, P3 p3);
}
