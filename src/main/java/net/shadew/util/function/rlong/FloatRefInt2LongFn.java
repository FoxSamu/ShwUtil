package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, an object and an {@code int} and returns a {@code long}.
 */
public interface FloatRefInt2LongFn<P2> {
    long invoke(float p1, P2 p2, int p3);
}
