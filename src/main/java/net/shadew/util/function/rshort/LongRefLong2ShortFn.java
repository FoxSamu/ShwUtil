package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, an object and a {@code long} and returns a {@code short}.
 */
public interface LongRefLong2ShortFn<P2> {
    short invoke(long p1, P2 p2, long p3);
}
