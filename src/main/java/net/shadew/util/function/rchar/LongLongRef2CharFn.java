package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, a {@code long} and an object and returns a {@code char}.
 */
public interface LongLongRef2CharFn<P3> {
    char invoke(long p1, long p2, P3 p3);
}
