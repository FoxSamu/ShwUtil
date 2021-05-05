package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, a {@code float} and an object and returns a {@code long}.
 */
public interface IntFloatRef2LongFn<P3> {
    long invoke(int p1, float p2, P3 p3);
}
