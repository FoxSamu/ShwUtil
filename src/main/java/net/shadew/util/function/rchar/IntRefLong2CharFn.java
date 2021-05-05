package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, an object and a {@code long} and returns a {@code char}.
 */
public interface IntRefLong2CharFn<P2> {
    char invoke(int p1, P2 p2, long p3);
}
