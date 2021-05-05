package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code char} and a {@code long} and returns a {@code long}.
 */
public interface RefCharLong2LongFn<P1> {
    long invoke(P1 p1, char p2, long p3);
}
