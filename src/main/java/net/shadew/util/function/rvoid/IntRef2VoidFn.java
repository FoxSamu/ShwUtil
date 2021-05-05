package net.shadew.util.function.rvoid;

/**
 * A function that takes an {@code int} and an object and returns nothing.
 */
public interface IntRef2VoidFn<P2> {
    void invoke(int p1, P2 p2);
}
