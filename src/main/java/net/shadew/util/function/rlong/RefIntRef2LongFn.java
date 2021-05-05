package net.shadew.util.function.rlong;

/**
 * A function that takes an object, an {@code int} and an object and returns a {@code long}.
 */
public interface RefIntRef2LongFn<P1, P3> {
    long invoke(P1 p1, int p2, P3 p3);
}
