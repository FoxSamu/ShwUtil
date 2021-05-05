package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code char}, an object and a {@code double} and returns a {@code short}.
 */
public interface CharRefDouble2ShortFn<P2> {
    short invoke(char p1, P2 p2, double p3);
}
