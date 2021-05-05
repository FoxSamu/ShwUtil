package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, a {@code double} and an object and returns an {@code int}.
 */
public interface LongDoubleRef2IntFn<P3> {
    int invoke(long p1, double p2, P3 p3);
}
