package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code float}, a {@code long} and an object and returns a {@code short}.
 */
public interface FloatLongRef2ShortFn<P3> {
    short invoke(float p1, long p2, P3 p3);
}
