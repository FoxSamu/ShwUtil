package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code float} and a {@code double} and returns a {@code long}.
 */
public interface RefFloatDouble2LongFn<P1> {
    long invoke(P1 p1, float p2, double p3);
}
