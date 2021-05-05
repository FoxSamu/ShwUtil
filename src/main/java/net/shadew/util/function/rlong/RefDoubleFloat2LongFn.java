package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code double} and a {@code float} and returns a {@code long}.
 */
public interface RefDoubleFloat2LongFn<P1> {
    long invoke(P1 p1, double p2, float p3);
}
