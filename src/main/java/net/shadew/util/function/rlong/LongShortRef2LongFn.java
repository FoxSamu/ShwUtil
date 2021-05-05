package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, a {@code short} and an object and returns a {@code long}.
 */
public interface LongShortRef2LongFn<P3> {
    long invoke(long p1, short p2, P3 p3);
}
