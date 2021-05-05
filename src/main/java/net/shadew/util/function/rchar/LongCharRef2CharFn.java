package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, a {@code char} and an object and returns a {@code char}.
 */
public interface LongCharRef2CharFn<P3> {
    char invoke(long p1, char p2, P3 p3);
}