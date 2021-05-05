package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, a {@code char} and an object and returns an {@code int}.
 */
public interface LongCharRef2IntFn<P3> {
    int invoke(long p1, char p2, P3 p3);
}
