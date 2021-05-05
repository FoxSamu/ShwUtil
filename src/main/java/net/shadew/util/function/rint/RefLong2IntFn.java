package net.shadew.util.function.rint;

/**
 * A function that takes an object and a {@code long} and returns an {@code int}.
 */
public interface RefLong2IntFn<P1> {
    int invoke(P1 p1, long p2);
}
