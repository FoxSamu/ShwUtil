package net.shadew.util.function.rvoid;

/**
 * A function that takes an object and an object and returns nothing.
 */
public interface RefRef2VoidFn<P1, P2> {
    void invoke(P1 p1, P2 p2);
}
