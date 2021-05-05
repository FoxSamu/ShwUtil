package net.shadew.util.function.rchar;

/**
 * A function that takes an object and a {@code long} and returns a {@code char}.
 */
public interface RefLong2CharFn<P1> {
    char invoke(P1 p1, long p2);
}
