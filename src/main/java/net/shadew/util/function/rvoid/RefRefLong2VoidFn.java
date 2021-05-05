package net.shadew.util.function.rvoid;

/**
 * A function that takes an object, an object and a {@code long} and returns nothing.
 */
public interface RefRefLong2VoidFn<P1, P2> {
    void invoke(P1 p1, P2 p2, long p3);
}
