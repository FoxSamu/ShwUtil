package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, an object and a {@code float} and returns a {@code long}.
 */
public interface FloatRefFloat2LongFn<P2> {
    long invoke(float p1, P2 p2, float p3);
}
