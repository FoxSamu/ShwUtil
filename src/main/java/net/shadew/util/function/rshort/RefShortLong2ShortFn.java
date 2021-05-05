package net.shadew.util.function.rshort;

/**
 * A function that takes an object, a {@code short} and a {@code long} and returns a {@code short}.
 */
public interface RefShortLong2ShortFn<P1> {
    short invoke(P1 p1, short p2, long p3);
}
