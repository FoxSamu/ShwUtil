package net.shadew.util.function.rvoid;

/**
 * A function that takes an {@code int}, an object and an {@code int} and returns nothing.
 */
public interface IntRefInt2VoidFn<P2> {
    void invoke(int p1, P2 p2, int p3);
}
