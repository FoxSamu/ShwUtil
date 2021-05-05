package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code char} and a {@code long} and returns a {@code char}.
 */
public interface RefCharLong2CharFn<P1> {
    char invoke(P1 p1, char p2, long p3);
}
