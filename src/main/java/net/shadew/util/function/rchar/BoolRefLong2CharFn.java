package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean}, an object and a {@code long} and returns a {@code char}.
 */
public interface BoolRefLong2CharFn<P2> {
    char invoke(boolean p1, P2 p2, long p3);
}
