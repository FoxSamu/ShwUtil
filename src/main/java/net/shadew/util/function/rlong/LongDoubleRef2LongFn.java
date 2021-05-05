package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, a {@code double} and an object and returns a {@code long}.
 */
public interface LongDoubleRef2LongFn<P3> {
    long invoke(long p1, double p2, P3 p3);
}
