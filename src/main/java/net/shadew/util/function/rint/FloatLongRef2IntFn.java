package net.shadew.util.function.rint;

/**
 * A function that takes a {@code float}, a {@code long} and an object and returns an {@code int}.
 */
public interface FloatLongRef2IntFn<P3> {
    int invoke(float p1, long p2, P3 p3);
}
