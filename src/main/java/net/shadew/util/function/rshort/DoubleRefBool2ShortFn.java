package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code double}, an object and a {@code boolean} and returns a {@code short}.
 */
public interface DoubleRefBool2ShortFn<P2> {
    short invoke(double p1, P2 p2, boolean p3);
}
