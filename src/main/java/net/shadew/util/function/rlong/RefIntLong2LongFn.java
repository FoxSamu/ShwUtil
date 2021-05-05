package net.shadew.util.function.rlong;

/**
 * A function that takes an object, an {@code int} and a {@code long} and returns a {@code long}.
 */
public interface RefIntLong2LongFn<P1> {
    long invoke(P1 p1, int p2, long p3);
}
