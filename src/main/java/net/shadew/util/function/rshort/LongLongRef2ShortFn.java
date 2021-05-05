package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, a {@code long} and an object and returns a {@code short}.
 */
public interface LongLongRef2ShortFn<P3> {
    short invoke(long p1, long p2, P3 p3);
}
