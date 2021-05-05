package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code long} and a {@code long} and returns a {@code long}.
 */
public interface RefLongLong2LongFn<P1> {
    long invoke(P1 p1, long p2, long p3);
}
