package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code double}, an object and a {@code double} and returns nothing.
 */
public interface DoubleRefDouble2VoidFn<P2> {
    void invoke(double p1, P2 p2, double p3);
}
