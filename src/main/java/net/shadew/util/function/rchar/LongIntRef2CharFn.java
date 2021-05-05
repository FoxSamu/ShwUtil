package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, an {@code int} and an object and returns a {@code char}.
 */
public interface LongIntRef2CharFn<P3> {
    char invoke(long p1, int p2, P3 p3);
}
