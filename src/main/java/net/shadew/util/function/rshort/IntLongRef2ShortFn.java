package net.shadew.util.function.rshort;

/**
 * A function that takes an {@code int}, a {@code long} and an object and returns a {@code short}.
 */
public interface IntLongRef2ShortFn<P3> {
    short invoke(int p1, long p2, P3 p3);
}
