package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code short} and a {@code long} and returns a {@code char}.
 */
public interface RefShortLong2CharFn<P1> {
    char invoke(P1 p1, short p2, long p3);
}
