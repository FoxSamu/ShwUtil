package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code float}, an object and an {@code int} and returns a {@code short}.
 */
public interface FloatRefInt2ShortFn<P2> {
    short invoke(float p1, P2 p2, int p3);
}
