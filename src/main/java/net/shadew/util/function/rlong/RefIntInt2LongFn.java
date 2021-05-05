package net.shadew.util.function.rlong;

/**
 * A function that takes an object, an {@code int} and an {@code int} and returns a {@code long}.
 */
public interface RefIntInt2LongFn<P1> {
    long invoke(P1 p1, int p2, int p3);
}
