package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code float} and an {@code int} and returns a {@code long}.
 */
public interface RefFloatInt2LongFn<P1> {
    long invoke(P1 p1, float p2, int p3);
}
