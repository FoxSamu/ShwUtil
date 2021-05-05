package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float} and an object and returns a {@code long}.
 */
public interface FloatRef2LongFn<P2> {
    long invoke(float p1, P2 p2);
}
