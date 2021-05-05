package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, a {@code float} and an object and returns an {@code int}.
 */
public interface LongFloatRef2IntFn<P3> {
    int invoke(long p1, float p2, P3 p3);
}
