package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, an object and a {@code long} and returns a {@code char}.
 */
public interface ShortRefLong2CharFn<P2> {
    char invoke(short p1, P2 p2, long p3);
}
