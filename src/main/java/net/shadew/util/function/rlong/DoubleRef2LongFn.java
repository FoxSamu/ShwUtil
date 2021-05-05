package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double} and an object and returns a {@code long}.
 */
public interface DoubleRef2LongFn<P2> {
    long invoke(double p1, P2 p2);
}
