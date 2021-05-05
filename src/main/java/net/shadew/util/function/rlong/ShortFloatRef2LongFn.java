package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code float} and an object and returns a {@code long}.
 */
public interface ShortFloatRef2LongFn<P3> {
    long invoke(short p1, float p2, P3 p3);
}