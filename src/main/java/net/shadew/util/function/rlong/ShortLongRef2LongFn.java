package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code long} and an object and returns a {@code long}.
 */
public interface ShortLongRef2LongFn<P3> {
    long invoke(short p1, long p2, P3 p3);
}
