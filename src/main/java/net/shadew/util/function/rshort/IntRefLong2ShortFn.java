package net.shadew.util.function.rshort;

/**
 * A function that takes an {@code int}, an object and a {@code long} and returns a {@code short}.
 */
public interface IntRefLong2ShortFn<P2> {
    short invoke(int p1, P2 p2, long p3);
}
