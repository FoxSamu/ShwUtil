package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, an object and a {@code long} and returns a {@code long}.
 */
public interface BoolRefLong2LongFn<P2> {
    long invoke(boolean p1, P2 p2, long p3);
}
