package net.shadew.util.function.rint;

/**
 * A function that takes a {@code short}, an object and a {@code long} and returns an {@code int}.
 */
public interface ShortRefLong2IntFn<P2> {
    int invoke(short p1, P2 p2, long p3);
}
