package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, an object and an object and returns a {@code long}.
 */
public interface DoubleRefRef2LongFn<P2, P3> {
    long invoke(double p1, P2 p2, P3 p3);
}
