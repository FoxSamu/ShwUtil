package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code short}, a {@code long} and an object and returns nothing.
 */
public interface ShortLongRef2VoidFn<P3> {
    void invoke(short p1, long p2, P3 p3);
}
