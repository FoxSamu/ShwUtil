package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, a {@code double} and an object and returns a {@code long}.
 */
public interface FloatDoubleRef2LongFn<P3> {
    long invoke(float p1, double p2, P3 p3);
}
