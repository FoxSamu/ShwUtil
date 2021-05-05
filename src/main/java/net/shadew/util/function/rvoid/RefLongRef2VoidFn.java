package net.shadew.util.function.rvoid;

/**
 * A function that takes an object, a {@code long} and an object and returns nothing.
 */
public interface RefLongRef2VoidFn<P1, P3> {
    void invoke(P1 p1, long p2, P3 p3);
}
