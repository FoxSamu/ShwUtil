package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code boolean}, an object and an object and returns a {@code short}.
 */
public interface BoolRefRef2ShortFn<P2, P3> {
    short invoke(boolean p1, P2 p2, P3 p3);
}
