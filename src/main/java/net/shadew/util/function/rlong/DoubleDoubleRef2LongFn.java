package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, a {@code double} and an object and returns a {@code long}.
 */
public interface DoubleDoubleRef2LongFn<P3> {
    long invoke(double p1, double p2, P3 p3);
}
