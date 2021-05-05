package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, a {@code float} and an object and returns a {@code short}.
 */
public interface LongFloatRef2ShortFn<P3> {
    short invoke(long p1, float p2, P3 p3);
}
