package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, a {@code long} and an object and returns a {@code char}.
 */
public interface CharLongRef2CharFn<P3> {
    char invoke(char p1, long p2, P3 p3);
}
