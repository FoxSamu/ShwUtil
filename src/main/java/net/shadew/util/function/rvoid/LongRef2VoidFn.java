package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long} and an object and returns nothing.
 */
public interface LongRef2VoidFn<P2> {
    void invoke(long p1, P2 p2);
}
