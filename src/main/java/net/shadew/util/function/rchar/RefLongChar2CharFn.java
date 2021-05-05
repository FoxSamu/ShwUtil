package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code long} and a {@code char} and returns a {@code char}.
 */
public interface RefLongChar2CharFn<P1> {
    char invoke(P1 p1, long p2, char p3);
}
