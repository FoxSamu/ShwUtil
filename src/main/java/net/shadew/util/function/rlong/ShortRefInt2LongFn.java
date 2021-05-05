package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, an object and an {@code int} and returns a {@code long}.
 */
public interface ShortRefInt2LongFn<P2> {
    long invoke(short p1, P2 p2, int p3);
}
