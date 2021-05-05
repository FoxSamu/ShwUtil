package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, an object and a {@code short} and returns a {@code char}.
 */
public interface LongRefShort2CharFn<P2> {
    char invoke(long p1, P2 p2, short p3);
}
