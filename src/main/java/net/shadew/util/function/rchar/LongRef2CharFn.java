package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long} and an object and returns a {@code char}.
 */
public interface LongRef2CharFn<P2> {
    char invoke(long p1, P2 p2);
}
