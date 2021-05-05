package net.shadew.util.function.rint;

/**
 * A function that takes a {@code long}, a {@code boolean} and an object and returns an {@code int}.
 */
public interface LongBoolRef2IntFn<P3> {
    int invoke(long p1, boolean p2, P3 p3);
}
