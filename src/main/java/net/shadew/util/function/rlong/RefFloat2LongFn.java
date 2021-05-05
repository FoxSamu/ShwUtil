package net.shadew.util.function.rlong;

/**
 * A function that takes an object and a {@code float} and returns a {@code long}.
 */
public interface RefFloat2LongFn<P1> {
    long invoke(P1 p1, float p2);
}
