package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code long} and a {@code float} and returns a {@code long}.
 */
public interface RefLongFloat2LongFn<P1> {
    long invoke(P1 p1, Long p2, Float p3);
}
