package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, a {@code float} and an object and returns a {@code long}.
 */
public interface DoubleFloatRef2LongFn<P3> {
    long invoke(Double p1, Float p2, P3 p3);
}
