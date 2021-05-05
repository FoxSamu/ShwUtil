package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code char}, an object and a {@code long} and returns nothing.
 */
public interface CharRefLong2VoidFn<P2> {
    void invoke(char p1, P2 p2, long p3);
}
