package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, an object and an {@code int} and returns a {@code long}.
 */
public interface IntRefInt2LongFn<P2> {
    long invoke(int p1, P2 p2, int p3);
}
