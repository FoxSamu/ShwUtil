package net.shadew.util.function.rint;

/**
 * A function that takes a {@code char}, an object and a {@code long} and returns an {@code int}.
 */
public interface CharRefLong2IntFn<P2> {
    int invoke(char p1, P2 p2, long p3);
}