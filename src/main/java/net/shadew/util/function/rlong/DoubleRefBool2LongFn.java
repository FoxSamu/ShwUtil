package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, an object and a {@code boolean} and returns a {@code long}.
 */
public interface DoubleRefBool2LongFn<P2> {
    long invoke(double p1, P2 p2, boolean p3);
}
