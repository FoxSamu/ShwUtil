package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code double} and an object and returns a {@code short}.
 */
public interface DoubleRef2ShortFn<P2> {
    short invoke(double p1, P2 p2);
}
