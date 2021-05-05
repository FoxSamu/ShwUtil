package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code boolean}, an object and an {@code int} and returns a {@code short}.
 */
public interface BoolRefInt2ShortFn<P2> {
    short invoke(boolean p1, P2 p2, int p3);
}
