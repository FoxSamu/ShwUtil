package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code double} and a {@code boolean} and returns a {@code long}.
 */
public interface RefDoubleBool2LongFn<P1> {
    long invoke(P1 p1, double p2, boolean p3);
}
