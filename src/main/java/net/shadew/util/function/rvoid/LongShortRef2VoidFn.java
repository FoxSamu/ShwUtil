package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, a {@code short} and an object and returns nothing.
 */
public interface LongShortRef2VoidFn<P3> {
    void invoke(long p1, short p2, P3 p3);
}
