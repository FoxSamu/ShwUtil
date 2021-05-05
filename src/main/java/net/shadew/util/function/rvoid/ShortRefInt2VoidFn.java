package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code short}, an object and an {@code int} and returns nothing.
 */
public interface ShortRefInt2VoidFn<P2> {
    void invoke(short p1, P2 p2, int p3);
}
