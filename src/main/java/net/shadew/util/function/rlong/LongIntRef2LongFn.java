package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, an {@code int} and an object and returns a {@code long}.
 */
public interface LongIntRef2LongFn<P3> {
    long invoke(long p1, int p2, P3 p3);
}
