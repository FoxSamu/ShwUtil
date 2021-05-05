package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, an object and an {@code int} and returns a {@code long}.
 */
public interface BoolRefInt2LongFn<P2> {
    long invoke(boolean p1, P2 p2, int p3);
}
