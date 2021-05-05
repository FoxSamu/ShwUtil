package net.shadew.util.function.rlong;

/**
 * A function that takes an object and an {@code int} and returns a {@code long}.
 */
public interface RefInt2LongFn<P1> {
    long invoke(P1 p1, int p2);
}
