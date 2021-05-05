package net.shadew.util.function.rlong;

/**
 * A function that takes an object, an {@code int} and a {@code boolean} and returns a {@code long}.
 */
public interface RefIntBool2LongFn<P1> {
    long invoke(P1 p1, int p2, boolean p3);
}
