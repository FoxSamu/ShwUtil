package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, an object and a {@code short} and returns nothing.
 */
public interface LongRefShort2VoidFn<P2> {
    void invoke(long p1, P2 p2, short p3);
}
