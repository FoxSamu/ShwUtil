package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code long} and returns a {@code char}.
 */
public interface IntShortLong2CharFn {
    char invoke(int p1, short p2, long p3);
}