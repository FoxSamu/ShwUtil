package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code boolean}, an object and an object and returns nothing.
 */
public interface BoolRefRef2VoidFn<P2, P3> {
    void invoke(boolean p1, P2 p2, P3 p3);
}
