package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code double} and an {@code int} and returns a {@code long}.
 */
public interface RefDoubleInt2LongFn<P1> {
    long invoke(P1 p1, Double p2, Int p3);
}
