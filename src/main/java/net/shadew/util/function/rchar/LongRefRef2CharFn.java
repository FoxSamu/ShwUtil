package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, an object and an object and returns a {@code char}.
 */
public interface LongRefRef2CharFn<P2, P3> {
    char invoke(long p1, P2 p2, P3 p3);
}
