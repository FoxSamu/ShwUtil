package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, an object and a {@code double} and returns a {@code long}.
 */
public interface LongRefDouble2LongFn<P2> {
    long invoke(long p1, P2 p2, double p3);
}
