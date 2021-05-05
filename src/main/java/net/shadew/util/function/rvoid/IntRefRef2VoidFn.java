package net.shadew.util.function.rvoid;

/**
 * A function that takes an {@code int}, an object and an object and returns nothing.
 */
public interface IntRefRef2VoidFn<P2, P3> {
    void invoke(int p1, P2 p2, P3 p3);
}
