package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, a {@code short} and an object and returns a {@code short}.
 */
public interface LongShortRef2ShortFn<P3> {
    short invoke(long p1, short p2, P3 p3);
}
