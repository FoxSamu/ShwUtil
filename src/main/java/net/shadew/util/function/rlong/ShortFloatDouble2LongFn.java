package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code float} and a {@code double} and returns a {@code long}.
 */
public interface ShortFloatDouble2LongFn {
    long invoke(short p1, float p2, double p3);
}
