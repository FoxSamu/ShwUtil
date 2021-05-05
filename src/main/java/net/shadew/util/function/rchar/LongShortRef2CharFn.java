package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, a {@code short} and an object and returns a {@code char}.
 */
public interface LongShortRef2CharFn<P3> {
    char invoke(long p1, short p2, P3 p3);
}
