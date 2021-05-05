package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code long} and a {@code double} and returns a {@code long}.
 */
public interface RefLongDouble2LongFn<P1> {
    long invoke(P1 p1, long p2, double p3);
}
