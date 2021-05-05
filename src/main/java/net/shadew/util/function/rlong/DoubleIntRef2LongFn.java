package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, an {@code int} and an object and returns a {@code long}.
 */
public interface DoubleIntRef2LongFn<P3> {
    long invoke(double p1, int p2, P3 p3);
}
