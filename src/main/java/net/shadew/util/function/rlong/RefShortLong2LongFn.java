package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code short} and a {@code long} and returns a {@code long}.
 */
public interface RefShortLong2LongFn<P1> {
    long invoke(P1 p1, short p2, long p3);
}
