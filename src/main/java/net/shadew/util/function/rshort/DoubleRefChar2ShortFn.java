package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code double}, an object and a {@code char} and returns a {@code short}.
 */
public interface DoubleRefChar2ShortFn<P2> {
    short invoke(double p1, P2 p2, char p3);
}
