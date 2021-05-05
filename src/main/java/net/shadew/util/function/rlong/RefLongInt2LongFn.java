package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code long} and an {@code int} and returns a {@code long}.
 */
public interface RefLongInt2LongFn<P1> {
    long invoke(P1 p1, long p2, int p3);
}
