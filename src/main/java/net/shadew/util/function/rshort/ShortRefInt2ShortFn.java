package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code short}, an object and an {@code int} and returns a {@code short}.
 */
public interface ShortRefInt2ShortFn<P2> {
    short invoke(short p1, P2 p2, int p3);
}
