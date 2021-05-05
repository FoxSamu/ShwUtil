package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, an object and a {@code short} and returns a {@code short}.
 */
public interface LongRefShort2ShortFn<P2> {
    short invoke(long p1, P2 p2, short p3);
}
