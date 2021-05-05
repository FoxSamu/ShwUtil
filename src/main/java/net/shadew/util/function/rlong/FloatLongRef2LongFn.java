package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, a {@code long} and an object and returns a {@code long}.
 */
public interface FloatLongRef2LongFn<P3> {
    long invoke(float p1, long p2, P3 p3);
}
