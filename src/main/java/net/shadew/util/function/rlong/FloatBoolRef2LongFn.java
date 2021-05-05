package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, a {@code boolean} and an object and returns a {@code long}.
 */
public interface FloatBoolRef2LongFn<P3> {
    long invoke(float p1, boolean p2, P3 p3);
}
