package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, a {@code short} and an {@code int} and returns a {@code long}.
 */
public interface FloatShortInt2LongFn {
    long invoke(float p1, short p2, int p3);
}