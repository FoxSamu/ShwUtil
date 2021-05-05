package net.shadew.util.function.rlong;

/**
 * A function that takes an object, an {@code int} and a {@code float} and returns a {@code long}.
 */
public interface RefIntFloat2LongFn<P1> {
    long invoke(P1 p1, int p2, float p3);
}
