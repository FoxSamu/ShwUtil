package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code float} and a {@code boolean} and returns a {@code long}.
 */
public interface RefFloatBool2LongFn<P1> {
    long invoke(P1 p1, float p2, boolean p3);
}
