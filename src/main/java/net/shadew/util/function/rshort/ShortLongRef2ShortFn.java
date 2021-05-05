package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code short}, a {@code long} and an object and returns a {@code short}.
 */
public interface ShortLongRef2ShortFn<P3> {
    short invoke(short p1, long p2, P3 p3);
}
