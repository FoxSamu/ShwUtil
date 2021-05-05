package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, an {@code int} and a {@code float} and returns a {@code long}.
 */
public interface ShortIntFloat2LongFn {
    long invoke(short p1, int p2, float p3);
}