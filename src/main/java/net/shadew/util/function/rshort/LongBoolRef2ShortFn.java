package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code long}, a {@code boolean} and an object and returns a {@code short}.
 */
public interface LongBoolRef2ShortFn<P3> {
    short invoke(long p1, boolean p2, P3 p3);
}
