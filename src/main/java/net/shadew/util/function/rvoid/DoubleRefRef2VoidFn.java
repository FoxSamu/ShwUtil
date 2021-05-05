package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code double}, an object and an object and returns nothing.
 */
public interface DoubleRefRef2VoidFn<P2, P3> {
    void invoke(double p1, P2 p2, P3 p3);
}
