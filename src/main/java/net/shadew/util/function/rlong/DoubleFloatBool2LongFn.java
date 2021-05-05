package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code boolean} and returns a {@code long}.
 */
public interface DoubleFloatBool2LongFn {
    long invoke(double p1, float p2, boolean p3);
}
