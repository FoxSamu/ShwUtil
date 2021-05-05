package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, a {@code short} and an object and returns a {@code long}.
 */
public interface FloatShortRef2LongFn<P3> {
    long invoke(float p1, short p2, P3 p3);
}
