package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code double}, an {@code int} and an object and returns a {@code short}.
 */
public interface DoubleIntRef2ShortFn<P3> {
    short invoke(double p1, int p2, P3 p3);
}
