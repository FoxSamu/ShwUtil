package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, a {@code char} and an object and returns a {@code short}.
 */
public interface LongCharRef2ShortFn<P3> {
    short invoke(long p1, char p2, P3 p3);
}
