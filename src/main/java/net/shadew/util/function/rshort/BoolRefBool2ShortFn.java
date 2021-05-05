package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code boolean}, an object and a {@code boolean} and returns a {@code short}.
 */
public interface BoolRefBool2ShortFn<P2> {
    short invoke(boolean p1, P2 p2, boolean p3);
}
