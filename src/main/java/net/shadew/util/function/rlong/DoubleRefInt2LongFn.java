package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, an object and an {@code int} and returns a {@code long}.
 */
public interface DoubleRefInt2LongFn<P2> {
    long invoke(double p1, P2 p2, int p3);
}
