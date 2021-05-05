package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, an object and a {@code long} and returns a {@code long}.
 */
public interface CharRefLong2LongFn<P2> {
    long invoke(char p1, P2 p2, long p3);
}
