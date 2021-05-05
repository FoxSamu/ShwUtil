package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code double} and an object and returns nothing.
 */
public interface DoubleRef2VoidFn<P2> {
    void invoke(double p1, P2 p2);
}
