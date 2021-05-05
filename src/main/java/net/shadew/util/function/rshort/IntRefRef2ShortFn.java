package net.shadew.util.function.rshort;

/**
 * A function that takes an {@code int}, an object and an object and returns a {@code short}.
 */
public interface IntRefRef2ShortFn<P2, P3> {
    short invoke(int p1, P2 p2, P3 p3);
}
