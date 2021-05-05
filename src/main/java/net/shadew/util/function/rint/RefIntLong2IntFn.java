package net.shadew.util.function.rint;

/**
 * A function that takes an object, an {@code int} and a {@code long} and returns an {@code int}.
 */
public interface RefIntLong2IntFn<P1> {
    int invoke(P1 p1, int p2, long p3);
}
