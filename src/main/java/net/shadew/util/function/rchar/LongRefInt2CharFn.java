package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, an object and an {@code int} and returns a {@code char}.
 */
public interface LongRefInt2CharFn<P2> {
    char invoke(long p1, P2 p2, int p3);
}
