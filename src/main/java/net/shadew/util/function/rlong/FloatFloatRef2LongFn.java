package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, a {@code float} and an object and returns a {@code long}.
 */
public interface FloatFloatRef2LongFn<P3> {
    long invoke(float p1, float p2, P3 p3);
}
