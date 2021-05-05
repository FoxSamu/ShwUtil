package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, an object and a {@code float} and returns a {@code short}.
 */
public interface LongRefFloat2ShortFn<P2> {
    short invoke(long p1, P2 p2, float p3);
}
