package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code short}, an object and a {@code boolean} and returns nothing.
 */
public interface ShortRefBool2VoidFn<P2> {
    void invoke(short p1, P2 p2, boolean p3);
}