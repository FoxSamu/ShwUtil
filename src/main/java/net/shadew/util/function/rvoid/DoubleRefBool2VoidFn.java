package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code double}, an object and a {@code boolean} and returns nothing.
 */
public interface DoubleRefBool2VoidFn<P2> {
    void invoke(double p1, P2 p2, boolean p3);
}
