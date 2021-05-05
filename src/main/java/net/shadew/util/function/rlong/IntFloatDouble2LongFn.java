package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, a {@code float} and a {@code double} and returns a {@code long}.
 */
public interface IntFloatDouble2LongFn {
    long invoke(int p1, float p2, double p3);
}
