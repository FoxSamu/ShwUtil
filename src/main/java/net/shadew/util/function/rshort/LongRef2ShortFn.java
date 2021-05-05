package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long} and an object and returns a {@code short}.
 */
public interface LongRef2ShortFn<P2> {
    short invoke(long p1, P2 p2);
}
