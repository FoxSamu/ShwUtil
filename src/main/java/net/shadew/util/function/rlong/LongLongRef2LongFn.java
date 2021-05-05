package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, a {@code long} and an object and returns a {@code long}.
 */
public interface LongLongRef2LongFn<P3> {
    long invoke(long p1, long p2, P3 p3);
}