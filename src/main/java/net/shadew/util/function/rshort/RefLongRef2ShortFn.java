package net.shadew.util.function.rshort;

/**
 * A function that takes an object, a {@code long} and an object and returns a {@code short}.
 */
public interface RefLongRef2ShortFn<P1, P3> {
    short invoke(P1 p1, long p2, P3 p3);
}
