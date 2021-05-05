package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code boolean}, an object and an {@code int} and returns nothing.
 */
public interface BoolRefInt2VoidFn<P2> {
    void invoke(boolean p1, P2 p2, int p3);
}
