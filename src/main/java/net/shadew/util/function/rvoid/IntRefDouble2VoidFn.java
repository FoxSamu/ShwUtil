package net.shadew.util.function.rvoid;

/**
 * A function that takes an {@code int}, an object and a {@code double} and returns nothing.
 */
public interface IntRefDouble2VoidFn<P2> {
    void invoke(int p1, P2 p2, double p3);
}
