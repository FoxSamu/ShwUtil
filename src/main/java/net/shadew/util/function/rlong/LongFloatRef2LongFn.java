package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, a {@code float} and an object and returns a {@code long}.
 */
public interface LongFloatRef2LongFn<P3> {
    long invoke(long p1, float p2, P3 p3);
}
