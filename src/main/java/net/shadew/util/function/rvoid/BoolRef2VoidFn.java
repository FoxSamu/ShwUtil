package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code boolean} and an object and returns nothing.
 */
public interface BoolRef2VoidFn<P2> {
    void invoke(boolean p1, P2 p2);
}
