package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code double} and returns a {@code long}.
 */
public interface LongFloatDouble2LongFn {
    long invoke(long p1, float p2, double p3);
}
