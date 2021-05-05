package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, a {@code double} and an object and returns nothing.
 */
public interface LongDoubleRef2VoidFn<P3> {
    void invoke(long p1, double p2, P3 p3);
}
