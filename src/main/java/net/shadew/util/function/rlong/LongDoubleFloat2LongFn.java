package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, a {@code double} and a {@code float} and returns a {@code long}.
 */
public interface LongDoubleFloat2LongFn {
    long invoke(long p1, double p2, float p3);
}
