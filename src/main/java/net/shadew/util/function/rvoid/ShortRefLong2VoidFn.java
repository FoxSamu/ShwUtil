package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code short}, an object and a {@code long} and returns nothing.
 */
public interface ShortRefLong2VoidFn<P2> {
    void invoke(short p1, P2 p2, long p3);
}
