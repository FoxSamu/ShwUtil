package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code short}, an object and a {@code long} and returns a {@code short}.
 */
public interface ShortRefLong2ShortFn<P2> {
    short invoke(short p1, P2 p2, long p3);
}
