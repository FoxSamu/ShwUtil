package net.shadew.util.function.rvoid;

/**
 * A function that takes an object, an object and an {@code int} and returns nothing.
 */
public interface RefRefInt2VoidFn<P1, P2> {
    void invoke(P1 p1, P2 p2, int p3);
}
