package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code boolean}, a {@code long} and an object and returns a {@code short}.
 */
public interface BoolLongRef2ShortFn<P3> {
    short invoke(boolean p1, long p2, P3 p3);
}
