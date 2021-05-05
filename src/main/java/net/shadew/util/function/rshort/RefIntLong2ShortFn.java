package net.shadew.util.function.rshort;

/**
 * A function that takes an object, an {@code int} and a {@code long} and returns a {@code short}.
 */
public interface RefIntLong2ShortFn<P1> {
    short invoke(P1 p1, int p2, long p3);
}
