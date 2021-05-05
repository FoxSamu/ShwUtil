package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, an object and a {@code double} and returns a {@code long}.
 */
public interface FloatRefDouble2LongFn<P2> {
    long invoke(float p1, P2 p2, double p3);
}
