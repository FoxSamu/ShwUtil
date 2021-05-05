package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code float} and a {@code long} and returns a {@code long}.
 */
public interface RefFloatLong2LongFn<P1> {
    long invoke(P1 p1, float p2, long p3);
}
