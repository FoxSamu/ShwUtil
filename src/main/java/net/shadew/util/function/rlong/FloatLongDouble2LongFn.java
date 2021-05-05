package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, a {@code long} and a {@code double} and returns a {@code long}.
 */
public interface FloatLongDouble2LongFn {
    long invoke(float p1, long p2, double p3);
}
