package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, a {@code boolean} and an object and returns a {@code long}.
 */
public interface DoubleBoolRef2LongFn<P3> {
    long invoke(double p1, boolean p2, P3 p3);
}
