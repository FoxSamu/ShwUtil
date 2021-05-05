package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, a {@code float} and an {@code int} and returns a {@code long}.
 */
public interface DoubleFloatInt2LongFn {
    long invoke(double p1, float p2, int p3);
}
