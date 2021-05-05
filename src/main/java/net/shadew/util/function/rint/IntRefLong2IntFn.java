package net.shadew.util.function.rint;

/**
 * A function that takes an {@code int}, an object and a {@code long} and returns an {@code int}.
 */
public interface IntRefLong2IntFn<P2> {
    int invoke(int p1, P2 p2, long p3);
}
