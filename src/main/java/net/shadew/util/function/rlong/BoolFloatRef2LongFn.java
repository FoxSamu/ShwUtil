package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, a {@code float} and an object and returns a {@code long}.
 */
public interface BoolFloatRef2LongFn<P3> {
    long invoke(boolean p1, float p2, P3 p3);
}
