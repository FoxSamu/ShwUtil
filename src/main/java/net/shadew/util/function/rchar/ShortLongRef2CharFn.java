package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, a {@code long} and an object and returns a {@code char}.
 */
public interface ShortLongRef2CharFn<P3> {
    char invoke(short p1, long p2, P3 p3);
}
