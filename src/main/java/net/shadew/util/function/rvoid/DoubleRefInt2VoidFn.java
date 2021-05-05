package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code double}, an object and an {@code int} and returns nothing.
 */
public interface DoubleRefInt2VoidFn<P2> {
    void invoke(double p1, P2 p2, int p3);
}
