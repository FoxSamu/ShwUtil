package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code double}, an object and an {@code int} and returns a {@code short}.
 */
public interface DoubleRefInt2ShortFn<P2> {
    short invoke(double p1, P2 p2, int p3);
}
