package net.shadew.util.function.rlong;

/**
 * A function that takes an object and a {@code long} and returns a {@code long}.
 */
public interface RefLong2LongFn<P1> {
    long invoke(P1 p1, long p2);
}
