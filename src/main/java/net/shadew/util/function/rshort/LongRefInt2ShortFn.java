package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, an object and an {@code int} and returns a {@code short}.
 */
public interface LongRefInt2ShortFn<P2> {
    short invoke(Long p1, P2 p2, Int p3);
}
