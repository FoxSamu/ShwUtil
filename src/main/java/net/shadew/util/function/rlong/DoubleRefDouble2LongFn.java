package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, an object and a {@code double} and returns a {@code long}.
 */
public interface DoubleRefDouble2LongFn<P2> {
    long invoke(Double p1, P2 p2, Double p3);
}
