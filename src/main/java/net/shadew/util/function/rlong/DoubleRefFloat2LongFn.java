package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, an object and a {@code float} and returns a {@code long}.
 */
public interface DoubleRefFloat2LongFn<P2> {
    long invoke(double p1, P2 p2, float p3);
}
