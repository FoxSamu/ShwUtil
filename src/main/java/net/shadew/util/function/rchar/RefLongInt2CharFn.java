package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code long} and an {@code int} and returns a {@code char}.
 */
public interface RefLongInt2CharFn<P1> {
    char invoke(P1 p1, long p2, int p3);
}
