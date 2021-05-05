package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, a {@code double} and an object and returns a {@code long}.
 */
public interface IntDoubleRef2LongFn<P3> {
    long invoke(int p1, double p2, P3 p3);
}
