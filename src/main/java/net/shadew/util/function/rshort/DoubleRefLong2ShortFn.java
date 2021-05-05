package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code double}, an object and a {@code long} and returns a {@code short}.
 */
public interface DoubleRefLong2ShortFn<P2> {
    short invoke(double p1, P2 p2, long p3);
}
