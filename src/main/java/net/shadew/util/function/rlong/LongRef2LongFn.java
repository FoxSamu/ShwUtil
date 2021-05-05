package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long} and an object and returns a {@code long}.
 */
public interface LongRef2LongFn<P2> {
    long invoke(long p1, P2 p2);
}
