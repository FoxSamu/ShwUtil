package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, a {@code boolean} and an object and returns a {@code long}.
 */
public interface LongBoolRef2LongFn<P3> {
    long invoke(long p1, boolean p2, P3 p3);
}
