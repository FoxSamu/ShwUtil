package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, an object and a {@code long} and returns a {@code long}.
 */
public interface IntRefLong2LongFn<P2> {
    long invoke(int p1, P2 p2, long p3);
}
