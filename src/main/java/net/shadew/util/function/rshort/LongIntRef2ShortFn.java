package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, an {@code int} and an object and returns a {@code short}.
 */
public interface LongIntRef2ShortFn<P3> {
    short invoke(long p1, int p2, P3 p3);
}
