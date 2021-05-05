package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, a {@code long} and a {@code boolean} and returns a {@code long}.
 */
public interface LongLongBool2LongFn {
    long invoke(long p1, long p2, boolean p3);
}