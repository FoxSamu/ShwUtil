package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, an {@code int} and an object and returns a {@code long}.
 */
public interface ShortIntRef2LongFn<P3> {
    long invoke(short p1, int p2, P3 p3);
}
